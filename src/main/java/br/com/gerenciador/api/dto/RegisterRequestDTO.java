package br.com.gerenciador.api.dto;

import br.com.gerenciador.api.enums.Role;

public record RegisterRequestDTO(
    String username,
    String password,
    String email,
    Role role
) {
}
