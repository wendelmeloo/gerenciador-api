package br.com.gerenciador.api.controller;

import br.com.gerenciador.api.dto.EstatisticasResponseDTO;
import br.com.gerenciador.api.repository.ClienteRepository;
import br.com.gerenciador.api.repository.FornecedorRepository;
import br.com.gerenciador.api.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatisticas")
@RequiredArgsConstructor
public class EstatisticasController {

    private final FornecedorRepository fornecedorRepository;
    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;

    @GetMapping
    public ResponseEntity<EstatisticasResponseDTO> obterEstatisticas() {
        Long totalFornecedores = fornecedorRepository.count();
        Long totalProdutos = produtoRepository.count();
        Long totalClientes = clienteRepository.count();

        EstatisticasResponseDTO responseDTO =new EstatisticasResponseDTO(
                totalFornecedores,
                totalProdutos,
                totalClientes);

        return ResponseEntity.ok(responseDTO);
    }
}
