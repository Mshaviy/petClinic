package com.petProject.petClinic.repository;

import com.petProject.petClinic.domain.Vet;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface VetRepository extends Repository<Vet, Integer> {

    @Transactional(readOnly = true)
    @Cacheable("vets")
    Collection <Vet> findAll();
}
