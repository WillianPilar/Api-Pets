package com.apiPets.model.dto;

public class NewPetRequestDTO {

	private String dataCadastro;
	private PetDTO pet;
	private DonoDTO dono;

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public PetDTO getPet() {
		return pet;
	}

	public void setPet(PetDTO pet) {
		this.pet = pet;
	}

	public DonoDTO getDono() {
		return dono;
	}

	public void setDono(DonoDTO dono) {
		this.dono = dono;
	}

}
