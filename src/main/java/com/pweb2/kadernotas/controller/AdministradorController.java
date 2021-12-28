package com.pweb2.kadernotas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pweb2.kadernotas.repository.AdministradorRepository;

@RestController
@RequestMapping(value="/")
public class AdministradorController {
	@Autowired
	AdministradorRepository administradorRepository;
	
	// pagina de login
	@GetMapping("/login") 
	public String login(Model model) {
		return "login";
	}
	
	// pagina principal com as acoes do adm
	@GetMapping("/home")
	public String viewHomePage(Model model) {
		return "index";
	}
	
	
}
