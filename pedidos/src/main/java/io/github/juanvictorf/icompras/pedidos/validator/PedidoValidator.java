package io.github.juanvictorf.icompras.pedidos.validator;

import io.github.juanvictorf.icompras.pedidos.client.ClientsClient;
import io.github.juanvictorf.icompras.pedidos.client.ProdutosClient;
import io.github.juanvictorf.icompras.pedidos.model.ItemPedido;
import io.github.juanvictorf.icompras.pedidos.model.Pedido;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PedidoValidator {

    private final ProdutosClient produtosClient;
    private final ClientsClient clientsClient;

    public void validar(Pedido pedido){
        Long codigoCliente = pedido.getCodigoCliente();
        validarCliente(codigoCliente);
        pedido.getItens().forEach(this::validarItem);
    }

    private void validarCliente(Long codigo){

    }

    private void validarItem(ItemPedido item){

    }
}
