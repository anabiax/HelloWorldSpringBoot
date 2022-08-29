package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	@GetMapping
	public String bsm() {
		return "BSM’s da Generation Brasil"
				+ "\n MENTALIDADES:"
				+ "\n Orientação ao futuro"
				+ "\n Responsabilidade pessoal"
				+ "\n Mentalidade de crescimento"
				+ "\n Persistência"
				+ "\n HABILIDADES:"
				+ "\n Trabalho em equipe"
				+ "\n Orientação ao detalhe"
				+ "\n Proatividade"
				+ "\n Comunicação";
	}
}
