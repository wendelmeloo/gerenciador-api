package br.com.gerenciador.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record EnderecoDTO(

        @NotBlank(message = "O campo logradouro deve ser preenchido")
        @Size (max = 150)
        String logradouro,

        @NotBlank(message = "O campo numero deve ser preenchido")
        String numero,

        @Size(max= 50)
        String complemento,

        @NotBlank(message = "O campo bairro deve ser preenchido")
        @Size (max = 100)
        String bairro,

        @NotBlank(message = "O campo cidade deve ser preenchido")
        @Size (max = 100)
        String cidade,

        @NotBlank(message = "O campo estado deve ser preenchido")
        @Size (max = 50)
        String estado,

        @NotBlank(message = "O campo pais deve ser preenchido")
        @Size (max = 50)
        String pais,

        @NotBlank(message = "O campo cep deve ser preenchido")
        @Size (max = 8)
        String cep
) {
}
