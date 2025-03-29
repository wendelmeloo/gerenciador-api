package br.com.gerenciador.api.repository;

import br.com.gerenciador.api.model.Cliente;
import br.com.gerenciador.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long> {

}
