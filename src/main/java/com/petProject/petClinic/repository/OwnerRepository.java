package com.petProject.petClinic.repository;

import com.petProject.petClinic.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

    @Query("SELECT distinct owner from Owner owner left join owner.pets where owner.lastName like :lastName%")
    @Transactional(readOnly = true)
    Collection <Owner> findByLastName(@Param("lastName") String lastName);

    @Query("SELECT owner from Owner owner left join owner.pets where owner.id = :id")
    @Transactional(readOnly = true)
    Owner findById(@Param("id") int id);

    Owner save (Owner owner);

}
