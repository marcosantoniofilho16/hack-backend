package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.CategoriaProduto;

public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, UUID> {

}
