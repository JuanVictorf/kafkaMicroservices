package io.github.juanvictorf.icompras.clientes.repository;

import io.github.juanvictorf.icompras.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
