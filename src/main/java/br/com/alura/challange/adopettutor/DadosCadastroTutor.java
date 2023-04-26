package br.com.alura.challange.adopettutor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTutor(
		@NotBlank String nome,
		@Email @NotBlank String email, 
		@NotBlank String senha, 
		@NotBlank String confirmacaoSenha) {

}
