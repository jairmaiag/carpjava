package br.com.jairmaia.carp.business.aplication.pessoa.usecase;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

import br.com.jairmaia.carp.business.aplication.pessoa.dto.PessoaDto;
import br.com.jairmaia.carp.business.aplication.pessoa.dto.PessoaResumoDto;
import br.com.jairmaia.carp.business.entity.pessoa.Pessoa;

@Mapper
public interface PessoaMapper {

	@IterableMapping(elementTargetType = PessoaResumoDto.class)
	List<PessoaResumoDto> toListPessoaResumoDto(List<Pessoa> entities);
	
	PessoaResumoDto toPessoaResumoDto(Pessoa entity);
	
	PessoaDto toPessoaDto(Pessoa entity);
	
	Pessoa toPessoa(PessoaDto dto);
	
//	void updatePessoa(UcAtualizarPessoa dto, @MappingTarget Pessoa entity);
}
