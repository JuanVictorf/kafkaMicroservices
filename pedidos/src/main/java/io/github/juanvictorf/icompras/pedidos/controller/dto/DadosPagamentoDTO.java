package io.github.juanvictorf.icompras.pedidos.controller.dto;

import io.github.juanvictorf.icompras.pedidos.model.enums.TipoPagamento;

public record DadosPagamentoDTO(
        String dados,
        TipoPagamento tipoPagamento
) {
}
