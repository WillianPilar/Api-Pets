package com.apiPets.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetDTO {

	private String nome;
	private int idade;
	@JsonProperty("petAtivo")
	private boolean petAtivo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isPetAtivo() {
		return petAtivo;
	}

	public void setPetAtivo(boolean petAtivo) {
		this.petAtivo = petAtivo;
	}
}
