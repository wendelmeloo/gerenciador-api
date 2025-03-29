package br.com.gerenciador.api.mapper;

import br.com.gerenciador.api.dto.ClienteRequestDTO;
import br.com.gerenciador.api.dto.ClienteResponseDTO;
import br.com.gerenciador.api.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mapping(target = "id", ignore = true)
    Cliente toEntity(ClienteRequestDTO dto);

    ClienteResponseDTO toDTO(Cliente cliente);
}
