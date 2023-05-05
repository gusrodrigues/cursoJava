package com.example.demo;

public enum NivelDeAcesso {
	MASTER("Master"),
	ADMIN("Admin"),
	PADRAO("Padrao");
	
	private String nivelDeAcesso;
	
	NivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	public String getNivelDeAcesso() {return this.nivelDeAcesso;}
}
