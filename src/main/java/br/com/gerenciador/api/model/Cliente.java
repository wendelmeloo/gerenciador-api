package br.com.gerenciador.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;


    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @OneToOne(cascade = CascadeType.ALL) //Define o relacionamento One-to-One e exclusão em cascata
    @JoinColumn(name = "endereco_id", referencedColumnName = "id") // Chave estrangeira no banco de dados
    private Endereco endereco;

    @Column(name = "criado_em", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em")
    @UpdateTimestamp
    private LocalDateTime atualizadoEm;

}
