package com.apiPets.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchDonoDTO {

	@JsonProperty("nomeDono")
	private String nomeDono;
	
	@JsonProperty("cpf")
	private String cpf;

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
