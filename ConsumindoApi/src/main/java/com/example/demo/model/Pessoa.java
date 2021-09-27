package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private String email;
	private List<Integer> numeros = new ArrayList<>(); 
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, Integer idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", email=" + email + ", numeros=" + numeros + "]";
	}

	
	
	
}
	

