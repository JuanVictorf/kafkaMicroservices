package io.github.juanvictorf.icompras.pedidos.repository;

import io.github.juanvictorf.icompras.pedidos.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
