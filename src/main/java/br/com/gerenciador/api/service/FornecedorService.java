package br.com.gerenciador.api.service;


import br.com.gerenciador.api.dto.FornecedorRequestDTO;
import br.com.gerenciador.api.dto.FornecedorResponseDTO;

import java.util.List;

public interface FornecedorService {

    FornecedorResponseDTO criarFornecedor(FornecedorRequestDTO dto);

    List<FornecedorResponseDTO> listarTodosFornecedores();

    FornecedorResponseDTO buscarFornecedorPorId(Long id);

    FornecedorResponseDTO atualizarForncedorPeloId(Long id, FornecedorRequestDTO dto);

    void deletarFornecedorPeloId(Long id);

}