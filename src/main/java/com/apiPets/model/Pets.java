package com.apiPets.model;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_pets")
public class Pets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String nome;

	@Column(name = "data_nascimento")
	private Timestamp dataNascimento;
	
	@Column(name = "raca")
	private String raca;
	
	@Column
	private boolean ativo;

	@Column(name = "data_cadastro", updatable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")//Formatar o JSON de data que receber para o formato passado no pattern
	public LocalDate dataCadastro;
	
	@PrePersist //executa método anotado antes da entidade ser persistida (salva no BD)
	public void prePersist() {
		setDataCadastro(LocalDate.now());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Timestamp getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Timestamp dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
