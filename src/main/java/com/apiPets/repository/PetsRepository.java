package com.apiPets.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apiPets.model.Pets;

@Repository
@Transactional
public interface PetsRepository extends JpaRepository<Pets, Integer>{
	
//	@Query(value = "select * from public.tb_pets where nome :name", nativeQuery = true)
//	List<Pets> findByNome(@Param("name")String name);
	
	List<Pets> findByNome(String name);

}
