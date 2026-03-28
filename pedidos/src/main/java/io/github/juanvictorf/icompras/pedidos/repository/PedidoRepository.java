package io.github.juanvictorf.icompras.pedidos.repository;

import io.github.juanvictorf.icompras.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
