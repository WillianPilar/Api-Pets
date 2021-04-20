package com.apiPets.service;

import com.apiPets.model.Pets;
import com.apiPets.model.dto.NewPetRequestDTO;

public interface PetsService {
	Pets processPet(NewPetRequestDTO petRequest);

	String save(Pets pet);
}
