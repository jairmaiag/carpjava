package br.com.jairmaia.carp.business.entity.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Pessoa")
public class Pessoa {
	private static final String SEQUENCE_NAME = "Pessoa_idPes_seq";
	
	@Id
	@Column(name = "idPes")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = SEQUENCE_NAME)
	@SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
	private Long id;

	@Column(name = "nomePes")
	private String nome;

	@Column(name = "nomeMeioPes")
	private String nomemeio;

	@Column(name = "sobrenomePes")
	private String sobrenome;

	@Column(name = "ativoPes")
	private Boolean ativo;
	
}
