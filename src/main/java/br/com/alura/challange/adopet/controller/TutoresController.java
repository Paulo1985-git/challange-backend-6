package br.com.alura.challange.adopet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.challange.adopet.tutor.DadosCadastroTutor;
import br.com.alura.challange.adopet.tutor.Tutor;
import br.com.alura.challange.adopet.tutor.TutorRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/tutores")
public class TutoresController {

	@Autowired
	private TutorRepository repository;
	
	@PostMapping
	public ResponseEntity<String> cadastrar(@RequestBody @Valid DadosCadastroTutor dados) {
		if (!dados.senha().equals(dados.confirmacaoSenha())) {
			return ResponseEntity.badRequest().body("Senha e confirmação senha não conferem");
		}
		
		repository.save(new Tutor(dados));
		
		return ResponseEntity.ok("Tutor Cadastrado com sucesso");

	}
}


