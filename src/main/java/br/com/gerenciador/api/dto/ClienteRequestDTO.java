package br.com.gerenciador.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record ClienteRequestDTO(

        @NotBlank(message = "Nome é obrigatório")
        String nome,


        @CPF
        String cpf,

        @Email
        String email,

        @Valid
        EnderecoDTO endereco
){
}
