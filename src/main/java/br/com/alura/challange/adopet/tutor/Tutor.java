package br.com.alura.challange.adopet.tutor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@EqualsAndHashCode(of = "Id")
@ToString(of = { "id", "nome", "email" })
@Entity
@NoArgsConstructor
@Table(name = "tutores")
public class Tutor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String senha;

	public Tutor(DadosCadastroTutor dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.senha = dados.senha();
	}

}
