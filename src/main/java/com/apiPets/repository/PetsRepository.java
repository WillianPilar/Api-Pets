package com.apiPets.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apiPets.model.Pets;

@Repository
@Transactional
public interface PetsRepository extends CrudRepository<Pets, Integer>{

}
