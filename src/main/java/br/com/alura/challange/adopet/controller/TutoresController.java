package br.com.alura.challange.adopet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutores")
public class TutoresController {
	
	@PostMapping
	public void cadastrar() {
		System.out.println("Cadastrou!");
	}
	
}
