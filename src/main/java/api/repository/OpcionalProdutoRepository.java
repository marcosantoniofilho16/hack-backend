package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.OpcionalProduto;

public interface OpcionalProdutoRepository extends JpaRepository<OpcionalProduto, UUID> {

}
