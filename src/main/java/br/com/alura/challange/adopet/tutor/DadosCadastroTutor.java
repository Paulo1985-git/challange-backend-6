package br.com.alura.challange.adopet.tutor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTutor(
		@NotBlank String nome,
		@NotBlank @Email String email, 
		@NotBlank String senha, 
		@NotBlank String confirmacaoSenha) {

}
