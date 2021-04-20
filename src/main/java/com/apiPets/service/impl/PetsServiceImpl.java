package com.apiPets.service.impl;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiPets.model.Pets;
import com.apiPets.model.dto.NewPetRequestDTO;
import com.apiPets.repository.PetsRepository;
import com.apiPets.service.PetsService;

@Service
public class PetsServiceImpl implements PetsService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PetsServiceImpl.class);

	@Autowired
	private PetsRepository repository;

	@Override
	public Pets processPet(NewPetRequestDTO petRequest) {

		LOGGER.info("Processando data de nascimento do pet");
		Timestamp dataNascPet = Timestamp.valueOf(petRequest.getPet().getDataNascimento());
		
		Pets pet = new Pets();
		pet.setNome(petRequest.getPet().getNome());
		pet.setRaca(petRequest.getPet().getRaca());
		pet.setAtivo(petRequest.getPet().isPetAtivo());
		pet.setDataNascimento(dataNascPet);

		return pet;
	}

	@Override
	public String save(Pets pet) {
		repository.save(pet);
		return "Pet salvo com sucesso!";
	}

}
