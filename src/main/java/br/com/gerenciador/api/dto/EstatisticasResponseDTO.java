package br.com.gerenciador.api.dto;

public record EstatisticasResponseDTO(
        Long totalFornecedores,
        Long totalClientes,
        Long totalProdutos
) {
}
