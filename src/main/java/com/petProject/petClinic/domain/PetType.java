package com.petProject.petClinic.domain;

import com.petProject.petClinic.model.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends NamedEntity {
}
