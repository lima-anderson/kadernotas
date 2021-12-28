package com.pweb2.kadernotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pweb2.kadernotas.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
	
	Estudante findById(long id);
	
	void delete(Estudante e);
}
