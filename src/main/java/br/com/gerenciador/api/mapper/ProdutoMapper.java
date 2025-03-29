package br.com.gerenciador.api.mapper;

import br.com.gerenciador.api.dto.ProdutoRequestDTO;
import br.com.gerenciador.api.dto.ProdutoResponseDTO;
import br.com.gerenciador.api.model.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    @Mapping(target = "id", ignore = true)
    Produto toEntity(ProdutoRequestDTO dto);

    ProdutoResponseDTO toDTO(Produto produto);
}
