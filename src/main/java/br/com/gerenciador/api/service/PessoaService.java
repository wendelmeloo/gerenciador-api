package br.com.gerenciador.api.service;

import br.com.gerenciador.api.model.Pessoa;
import br.com.gerenciador.api.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private  final PessoaRepository pessoaRepository;

    public void criarPessoa(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }

    public Optional<Pessoa> buscarPessoaPeloId(Long id){
        return pessoaRepository.findById(id);
    }

    public List<Pessoa> buscarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    public void deletarPessoaPeloId(Long id){
        pessoaRepository.deleteById(id);
    }
}
