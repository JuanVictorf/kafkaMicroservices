package io.github.juanvictorf.icompras.pedidos.controller;

import io.github.juanvictorf.icompras.pedidos.controller.dto.RecebimentoCallBackPagamentoDTO;
import io.github.juanvictorf.icompras.pedidos.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos/callback-pagamentos")
@RequiredArgsConstructor
public class RecebimentoCallBackPagamentoController {

    private final PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Object> atualizarStatusPagamento(
            @RequestBody RecebimentoCallBackPagamentoDTO body,
            @RequestHeader(required = true, name = "apiKey") String apiKey){

        pedidoService.atualizarStatusPagamento(
                body.codigo(),
                body.chavePagamento(),
                body.status(),
                body.observacoes()
        );

        return ResponseEntity.ok().build();

    }
}
