package br.com.gerenciador.api.repository;

import br.com.gerenciador.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository  extends JpaRepository <Pessoa, Long> {
}
