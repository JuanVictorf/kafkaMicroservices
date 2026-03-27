package io.github.juanvictorf.icompras.produtos.repository;

import io.github.juanvictorf.icompras.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{
}
