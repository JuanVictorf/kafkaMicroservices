package io.github.juanvictorf.icompras.pedidos.service;

import io.github.juanvictorf.icompras.pedidos.model.Pedido;
import io.github.juanvictorf.icompras.pedidos.repository.ItemPedidoRepository;
import io.github.juanvictorf.icompras.pedidos.repository.PedidoRepository;
import io.github.juanvictorf.icompras.pedidos.validator.PedidoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;
    private final ItemPedidoRepository itemPedidoRepository;
    private final PedidoValidator validator;

    public Pedido criarPedido(Pedido pedido) {
        return null;
    }

}
