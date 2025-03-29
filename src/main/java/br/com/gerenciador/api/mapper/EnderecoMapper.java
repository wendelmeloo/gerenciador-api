package br.com.gerenciador.api.mapper;

import br.com.gerenciador.api.dto.EnderecoDTO;
import br.com.gerenciador.api.model.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {

    Endereco toEntity(EnderecoDTO dto);
    EnderecoDTO toDTO(Endereco endereco);
}
