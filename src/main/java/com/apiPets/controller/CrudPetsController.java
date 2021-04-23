package com.apiPets.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		String savePet = null;
		try {
			savePet = service.save(pet);
		} catch (Exception e) {
			LOGGER.error("Algo de errado aconteceu ao tentar salvar os dados do pet. ", e);
			return new ResponseEntity<String>(savePet, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<String>(savePet, HttpStatus.OK);
	}
	
	@GetMapping("/search-name/{name}")
	public ResponseEntity<List<Pets>> searchByName(@PathVariable String name){
		
		LOGGER.info("Pesquisando pet pelo nome");
		List<Pets> petsEncontrados = service.SearchPet(name);
		
		return new ResponseEntity<List<Pets>>(petsEncontrados, HttpStatus.OK);
	}
}
