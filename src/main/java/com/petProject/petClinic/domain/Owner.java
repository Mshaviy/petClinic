package com.petProject.petClinic.domain;

import com.petProject.petClinic.model.Person;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.util.*;

@Entity
@Table(name = "owners")
public class Owner extends Person {
    @Column
    @NotEmpty
    private String city;
    @Column
    @NotEmpty
    private String address;
    @Column
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    protected Set<Pet> getPetsInternal() {
        if (this.pets == null)
            this.pets = new HashSet<>();
        return this.pets;
    }

    protected void setPetsInternal(Set<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet> getPets() {
        List<Pet> sortedPets = new ArrayList<>(getPetsInternal());
        PropertyComparator.sort(sortedPets, new MutableSortDefinition("name", true, true));
        return Collections.unmodifiableList(sortedPets);
    }

    public void addPet(Pet pet) {
        if (pet.isNew())
            getPetsInternal().add(pet);
        pet.setOwner(this);
    }

    public Pet getPet(String name){
        return getPet(name, false);
    }

    public Pet getPet(String name, boolean ignoreNew) {
        name = name.toLowerCase();
        for (Pet pet : getPetsInternal()) {
            if (!ignoreNew || !pet.isNew()) {
                String compName = pet.getName();
                compName = compName.toLowerCase();
                if (compName.equals(name))
                    return pet;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this).
                append("id", this.getId()).
                append("new", this.isNew()).
                append("lastName", this.getLastName()).
                append("firstName", this.getFirstName()).
                append("city", this.city).
                append("address", this.address).
                append("telephone", this.telephone).toString();
    }
}
