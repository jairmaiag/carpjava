package br.com.jairmaia.carp.business.aplication.pessoa.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class PessoaResumoDto {

	private Long id;
	
	@NotBlank
	private String nome;

	private String nomemeio;

	private String sobrenome;

}
