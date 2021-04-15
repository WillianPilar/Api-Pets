package com.apiPets.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiPets.model.dto.DonoDTO;
import com.apiPets.model.dto.NewPetRequestDTO;
import com.apiPets.model.dto.PetDTO;


@RestController
@RequestMapping("/api-v1")
public class CrudPetsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CrudPetsController.class);

	@PostMapping("/new-pet")
	public ResponseEntity<String> newPet(@RequestBody NewPetRequestDTO request){
		
		LOGGER.info("PET: {}", request);
		
		DonoDTO donoReturn = request.getDono();
		PetDTO petReturn = request.getPet();
		
		System.out.println(donoReturn.getNome());
		
		return null;
		
	}
}
