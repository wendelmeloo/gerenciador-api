package br.com.gerenciador.api.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoRequestDTO(

        @NotBlank(message = "Nome é obrigatorio")
        String nome,

        @NotNull(message = "Preço é obrigatorio")
        @DecimalMin(value = "0.0", message = "Preço deve ser maior que zero")
        BigDecimal preco,

        String descricao,

        @NotNull(message = "Quantidade Estoque é obrigatorio")
        @DecimalMin(value = "0", message = "Quantidade Estoque não pode ser negativa")
        Integer quantidateEstoque,

        @NotNull(message = "Fornecedor é obrigatorio")
        Long fornecedorId

) {
}
