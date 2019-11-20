package com.petProject.petClinic.repository;

import com.petProject.petClinic.domain.Pet;
import com.petProject.petClinic.domain.PetType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PetRepository extends Repository<Pet, Integer> {

    @Query("select ptype from PetType ptype order by ptype.name")
    @Transactional(readOnly = true)
    List<PetType> findPetTypes();

    @Transactional(readOnly = true)
    Pet findById(Integer id);

    void save(Pet pet);

}
