package com.apiPets.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiPets.model.Pets;
import com.apiPets.model.dto.NewPetRequestDTO;
import com.apiPets.service.PetsService;


@RestController
@RequestMapping("/api-v1")
public class CrudPetsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CrudPetsController.class);
	
	@Autowired
	private PetsService service;

	@PostMapping("/new-pet")
	public ResponseEntity<String> newPet(@RequestBody NewPetRequestDTO request){
		
		LOGGER.info("Processando dados do PET");
		Pets pet = service.processPet(request);
		String savePet = service.save(pet);
		return new ResponseEntity<String>(savePet, HttpStatus.OK);
		
	}
}
