package br.com.gerenciador.api.controller;

import br.com.gerenciador.api.model.Pessoa;
import br.com.gerenciador.api.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarPessoa(@RequestBody Pessoa pessoa) {
        pessoaService.criarPessoa(pessoa);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Pessoa> buscarPessoaPeloId(@PathVariable Long id) {
        return pessoaService.buscarPessoaPeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Pessoa> buscarTodasPessoas() {
        return pessoaService.buscarTodasPessoas();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPessoaPeloId(@PathVariable Long id) {
        pessoaService.deletarPessoaPeloId(id);
    }
}
