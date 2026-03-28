package io.github.juanvictorf.icompras.pedidos.mappers;

import io.github.juanvictorf.icompras.pedidos.controller.dto.ItemPedidoDTO;
import io.github.juanvictorf.icompras.pedidos.model.ItemPedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemPedidoMapper {
    ItemPedido map(ItemPedidoDTO dto);
}
