package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world") // usada para mapear solicitações para os Métodos da Classe controladora
public class HelloWorldController {  //Classe é do tipo controladora rest, que receberá requisições
	
	@GetMapping
	public String helloWorld() {
		return "Hello world.";
	}

}
