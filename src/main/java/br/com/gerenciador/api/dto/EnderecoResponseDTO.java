package br.com.gerenciador.api.dto;

public record EnderecoResponseDTO(
    String logradouro,
    String numero,
    String complemento,
    String bairro,
    String cidade,
    String estado,
    String pais,
    String cep
) {
}
