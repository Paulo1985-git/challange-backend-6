package br.com.alura.challange.adopet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.challange.adopettutor.DadosCadastroTutor;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/tutores")
public class TutoresController {

	@PostMapping
	public ResponseEntity<String> cadastrar(@RequestBody @Valid DadosCadastroTutor dados) {
		if (!dados.senha().equals(dados.confirmacaoSenha())) {
			return ResponseEntity.badRequest().body("Senha e confirmação senha não conferem");
		}
		
		return ResponseEntity.ok("Tutor Cadastrado com sucesso");

	}
}


