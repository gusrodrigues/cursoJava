package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.extern.java.Log;

@Entity
@Data
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String nome;
	String sobrenome;
	String email;
	String dataDeNascimento;
	Sexo sexo;
	String cpf;
	String ddd;
	String telefone;
	NivelDeAcesso nivelDeAcesso;
}
