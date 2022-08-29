package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-semana")
public class ObjetivosdeAprendizagemController {
	
	@GetMapping
	public String objetivos() {
		return "Espero aprender a utilizar o framework e tirar o melhor proveito dele.";
	}
}
