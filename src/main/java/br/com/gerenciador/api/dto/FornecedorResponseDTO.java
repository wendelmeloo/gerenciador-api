package br.com.gerenciador.api.dto;

import br.com.gerenciador.api.enums.TipoFornecedorEnum;

public record FornecedorResponseDTO(
    Long id,
    String nome,
    String cnpj,
    String email,
    TipoFornecedorEnum tipoFornecedor,
    EnderecoResponseDTO endereco
) {
}
