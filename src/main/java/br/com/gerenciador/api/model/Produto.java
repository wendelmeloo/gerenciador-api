package br.com.gerenciador.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "preco", nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

    @Column(name = "descricao", length = 500)
    private String descricao;

    @Column(name = "quantidade_estoque")
    private Integer quantidateEstoque;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id", referencedColumnName = "id", nullable = false)
    private Fornecedor fornecedor;
}
