package com.apiPets.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonoDTO {
	
	@JsonProperty("nomeDono")
	private String nomeDono;
	private String dataNascimento;
	private String cpf;
	private String endereco;

	public String getNome() {
		return nomeDono;
	}

	public void setNome(String nome) {
		this.nomeDono = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
