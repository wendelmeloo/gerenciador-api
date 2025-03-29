package br.com.gerenciador.api.controller;

import br.com.gerenciador.api.dto.ProdutoRequestDTO;
import br.com.gerenciador.api.dto.ProdutoResponseDTO;
import br.com.gerenciador.api.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoResponseDTO> criarProduto(@Valid @RequestBody ProdutoRequestDTO dto) {
        ProdutoResponseDTO produtoCriado = produtoService.criarProduto(dto);
        return ResponseEntity.status(201).body(produtoCriado);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDTO>> listarTodosProdutos(Long fornecedorId) {
        return ResponseEntity.ok(produtoService.listarTodosProdutos(fornecedorId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponseDTO> buscarProdutoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.buscarProdutoPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponseDTO> atualizarProdutoPeloId(@PathVariable Long id, @Valid @RequestBody ProdutoRequestDTO dto) {
        return ResponseEntity.ok(produtoService.atualizarProdutoPeloId(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProdutoPeloId(@PathVariable Long id) {
        produtoService.deletarProdutoPeloId(id);
        return ResponseEntity.noContent().build();
    }

}
