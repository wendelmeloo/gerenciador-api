package br.com.gerenciador.api.mapper;

import br.com.gerenciador.api.dto.FornecedorRequestDTO;
import br.com.gerenciador.api.dto.FornecedorResponseDTO;
import br.com.gerenciador.api.model.Fornecedor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FornecedorMapper {

    //Convesor de DTO para entidade:
    @Mapping(target = "id", ignore = true)
    Fornecedor toEntity(FornecedorRequestDTO dto);

    //Conversor da entidade para DTO:
    FornecedorResponseDTO toDTO(Fornecedor fornecedor);
}
