package com.pweb2.kadernotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pweb2.kadernotas.model.Estudante;
import com.pweb2.kadernotas.repository.EstudanteRepository;

@RestController
@RequestMapping(value="/")
public class EstudanteController {
	@Autowired
	EstudanteRepository estudanteRepository;
	
	@GetMapping("/estudantes")
	public List<Estudante> listEstudantes() {
		return estudanteRepository.findAll();
	}
	
	@GetMapping("/estudantes/{id}")
	public Estudante getEstudante(@PathVariable(value="id") long id) {
		return estudanteRepository.findById(id);
	}
	
	@PostMapping("/estudantes")
	public Estudante postEstudante(@RequestBody Estudante estudante) {
		return estudanteRepository.save(estudante);
	}
	
	@DeleteMapping("/estudantes")
	public void deleteEstudante(@RequestBody Estudante estudante) {
		estudanteRepository.delete(estudante);
	}
}
