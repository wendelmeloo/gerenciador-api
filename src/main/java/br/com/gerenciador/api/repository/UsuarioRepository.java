package br.com.gerenciador.api.repository;

import br.com.gerenciador.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);}
