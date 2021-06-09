package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

}
