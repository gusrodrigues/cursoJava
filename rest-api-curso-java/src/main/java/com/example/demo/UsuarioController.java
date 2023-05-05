package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UsuarioController {
	@Autowired
	UsuarioRepository repository;
	
	// Buscar todos os usuário
	@GetMapping("/usuario")
	public List<Usuario> gitAllUsuarios(){
		return repository.findAll();
	}

	// Buscar usuario por id	
	@GetMapping("/usuario/{id}")
	public Usuario getUsuarioById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	// Inserir um novo usuario	
	@PostMapping("/usuario")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}

	// Remove usuário por id	
	@DeleteMapping("/usuario/{id}")
	public void deleteUsuarioById(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
