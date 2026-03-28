package io.github.juanvictorf.icompras.pedidos.mappers;

import io.github.juanvictorf.icompras.pedidos.controller.dto.NovoPedidoDTO;
import io.github.juanvictorf.icompras.pedidos.model.Pedido;

public interface PedidoMapper {
    Pedido map(NovoPedidoDTO dto);
}
