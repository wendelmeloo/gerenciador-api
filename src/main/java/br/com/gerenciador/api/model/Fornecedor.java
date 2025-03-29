package br.com.gerenciador.api.model;


import br.com.gerenciador.api.enums.TipoFornecedorEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "fornecedor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "cnpj",unique = true, nullable = false, length = 14, updatable = false)
    private String cnpj;

    @Column(name = "tipo_fornecedor", nullable = false)
    private TipoFornecedorEnum tipoFornecedor;

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
