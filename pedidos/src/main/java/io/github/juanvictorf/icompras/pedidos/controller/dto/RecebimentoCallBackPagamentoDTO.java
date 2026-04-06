package io.github.juanvictorf.icompras.pedidos.controller.dto;

public record RecebimentoCallBackPagamentoDTO(
        Long codigo,
        String chavePagamento,
        boolean status,
        String observacoes
) {
}
