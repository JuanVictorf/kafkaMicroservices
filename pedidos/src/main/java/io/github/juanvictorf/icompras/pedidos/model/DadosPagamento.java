package io.github.juanvictorf.icompras.pedidos.model;

import io.github.juanvictorf.icompras.pedidos.enums.TipoPagamento;
import lombok.Data;

@Data
public class DadosPagamento {
    private String dados;
    private TipoPagamento tipoPagamento;
}
