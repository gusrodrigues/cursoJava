package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UsuarioController {
	@Autowired
	UsuarioRepository repository;
	
	@GetMapping("/usuario")
	public List<Usuario> gitAllUsuarios(){
		return repository.findAll()
	}
}
