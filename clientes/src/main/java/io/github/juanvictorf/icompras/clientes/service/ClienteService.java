package io.github.juanvictorf.icompras.clientes.service;

import io.github.juanvictorf.icompras.clientes.model.Cliente;
import io.github.juanvictorf.icompras.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> obterPorCodigo(Long codigo) {
        return repository.findById(codigo);
    }
}
