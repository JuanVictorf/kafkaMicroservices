package io.github.juanvictorf.icompras.pedidos.validator;

import feign.FeignException;
import io.github.juanvictorf.icompras.pedidos.client.ClientsClient;
import io.github.juanvictorf.icompras.pedidos.client.ProdutosClient;
import io.github.juanvictorf.icompras.pedidos.client.representation.ClienteRepresentation;
import io.github.juanvictorf.icompras.pedidos.client.representation.ProdutoRepresentation;
import io.github.juanvictorf.icompras.pedidos.model.ItemPedido;
import io.github.juanvictorf.icompras.pedidos.model.Pedido;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class PedidoValidator {

    private final ProdutosClient produtosClient;
    private final ClientsClient clientsClient;

    public void validar(Pedido pedido){
        Long codigoCliente = pedido.getCodigoCliente();
        validarCliente(codigoCliente);
        pedido.getItens().forEach(this::validarItem);
    }

    private void validarCliente(Long codigo){
        try{
            var response = clientsClient.obterDados(codigo);
            ClienteRepresentation cliente = response.getBody();
            log.info("Cliente de código {} encontrado: {} ", cliente.codigo(), cliente.nome());
        } catch (FeignException.NotFound e){
            log.error("Cliente não encontrado");
        }

    }

    private void validarItem(ItemPedido item){
        try{
            var response = produtosClient.obterDados(item.getCodigoProduto());
            ProdutoRepresentation produto = response.getBody();
            log.info("Produto de código {} encontrado: {}", produto.codigo(), produto.nome());
        } catch (FeignException.NotFound e) {
            log.error("Produto não encontrado");
        }
    }
}
