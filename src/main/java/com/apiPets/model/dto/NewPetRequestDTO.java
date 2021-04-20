package com.apiPets.model.dto;

public class NewPetRequestDTO {

	private PetDTO pet;
	private SearchDonoDTO dono;

	public PetDTO getPet() {
		return pet;
	}

	public void setPet(PetDTO pet) {
		this.pet = pet;
	}

	public SearchDonoDTO getDono() {
		return dono;
	}

	public void setDono(SearchDonoDTO dono) {
		this.dono = dono;
	}

}
