package com.pweb2.kadernotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pweb2.kadernotas.model.Estudante;
import com.pweb2.kadernotas.repository.EstudanteRepository;

public class EstudanteServiceImpl implements EstudanteService {

	@Autowired
	private EstudanteRepository estudanteRepository;
	
	@Override
	public List<Estudante> getAllEstudantes() {
		return estudanteRepository.findAll();
	}

}
