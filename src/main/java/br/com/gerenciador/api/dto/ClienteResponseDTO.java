package br.com.gerenciador.api.dto;

public record ClienteResponseDTO(
    Long id,
    String nome,
    String cpf,
    String email,
    EnderecoResponseDTO endereco
) {
}
