package com.petProject.petClinic.repository;

import com.petProject.petClinic.domain.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitRepository extends JpaRepository <Visit, Integer> {

    Visit save(Visit visit);

    List <Visit> findByPetId(Integer petId);
}
