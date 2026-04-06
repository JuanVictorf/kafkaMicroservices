package io.github.juanvictorf.icompras.pedidos.model;

public record ErroResposta(
        String mensagem,
        String campo,
        String erro
) {
}
