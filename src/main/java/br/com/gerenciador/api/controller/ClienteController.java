package br.com.gerenciador.api.controller;

import br.com.gerenciador.api.dto.ClienteRequestDTO;
import br.com.gerenciador.api.dto.ClienteResponseDTO;
import br.com.gerenciador.api.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> criarCliente(@Valid @RequestBody ClienteRequestDTO dto){
        ClienteResponseDTO clienteCriado = clienteService.criarCliente(dto);
        return ResponseEntity.status(201).body(clienteCriado);
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listarTodosClientes(){
        return ResponseEntity.ok(clienteService.listarTodosClientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> buscarClientePorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarClientePorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> atualizarClientePeloId(@PathVariable Long id, @Valid @RequestBody ClienteRequestDTO dto){
        return ResponseEntity.ok(clienteService.atualizarClientePeloId(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarClientePeloId(@PathVariable Long id){
        clienteService.deletarClientePeloId(id);
        return ResponseEntity.noContent().build();
    }

}
