package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!";	
	}
	
	@GetMapping("/bsm-generation")
	public String bsmGeneration() {
		return "Persistência;\n"
				+ "Orientação ao detalhe;\n"
				+ "Trabalho em equipe;\n"
				+ "Comunicação;\n"
				+ "Mentalidade de crescimento;\n"
				+ "Orientação ao futuro;";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Engajar no linkedin;\n"
			 + "Entregar as atividades dentro dos prazos;\n"
		     + "Terminar o projeto Hortifrutti;";
	}
}
