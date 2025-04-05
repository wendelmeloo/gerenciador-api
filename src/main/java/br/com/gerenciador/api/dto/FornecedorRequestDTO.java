package br.com.gerenciador.api.dto;

import br.com.gerenciador.api.enums.TipoFornecedorEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CNPJ;

public record FornecedorRequestDTO(
        @NotBlank (message = "O campo nome deve ser preenchido")
        @Size(max = 100)
        String nome,

        @CNPJ
        String cnpj,

        @Email
        String email,

        @NotNull(message = "Tipo Fornecedor é obrigatorio")
        TipoFornecedorEnum tipoFornecedor,

        @Valid
        EnderecoDTO endereco
) {
}
