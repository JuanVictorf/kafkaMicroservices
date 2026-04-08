package io.github.juanvictorf.icompras.pedidos.controller.dto;

import io.github.juanvictorf.icompras.pedidos.model.enums.TipoPagamento;

public record AdicionaNovoPagamentoDTO(
        Long codigoPedido,
        String dados,
        TipoPagamento tipoPagamento
) {
}
