package com.apiPets.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetDTO {

	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("dataNascimento")
	private String dataNascimento;
	
	@JsonProperty("raca")
	private String raca;
	
	@JsonProperty("petAtivo")
	private boolean petAtivo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isPetAtivo() {
		return petAtivo;
	}

	public void setPetAtivo(boolean petAtivo) {
		this.petAtivo = petAtivo;
	}

}
