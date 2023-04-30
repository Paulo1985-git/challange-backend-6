package br.com.alura.challange.adopet.tutor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(of = "Id")
@ToString(of = { "id", "nome", "email" })
@Entity
@NoArgsConstructor
@Table(name = "tutores")
public class Tutor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String nome;
	private String email;
	private String senha;

	public Tutor() {

	}

	public Tutor(DadosCadastroTutor dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.senha = dados.senha();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

}
