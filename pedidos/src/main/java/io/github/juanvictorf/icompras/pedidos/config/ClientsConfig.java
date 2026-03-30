package io.github.juanvictorf.icompras.pedidos.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = " io.github.juanvictorf.icompras.pedidos.cliente")
public class ClientsConfig {
}
