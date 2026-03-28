package io.github.juanvictorf.icompras.pedidos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "item_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "codigo_pedido")
    private Pedido pedido;

    @Column(name = "codigo_produto")
    private Long codigoProduto;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "valor_unitario", precision = 16, scale = 2)
    private BigDecimal valorUnitario;
}
