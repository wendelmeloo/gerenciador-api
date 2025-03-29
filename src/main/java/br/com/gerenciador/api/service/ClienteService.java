package br.com.gerenciador.api.service;

import br.com.gerenciador.api.dto.ClienteRequestDTO;
import br.com.gerenciador.api.dto.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {

    ClienteResponseDTO criarCliente(ClienteRequestDTO dto);

    List<ClienteResponseDTO> listarTodosClientes();

    ClienteResponseDTO buscarClientePorId(Long id);

    ClienteResponseDTO atualizarClientePeloId(Long id, ClienteRequestDTO dto);

    void deletarClientePeloId(Long id);
}
