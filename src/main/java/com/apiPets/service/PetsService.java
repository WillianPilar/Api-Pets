package com.apiPets.service;

import java.util.List;

import com.apiPets.model.Pets;
import com.apiPets.model.dto.NewPetRequestDTO;

public interface PetsService {
	Pets processPet(NewPetRequestDTO petRequest);

	String save(Pets pet);

	List<Pets> SearchPet(String name);
}
