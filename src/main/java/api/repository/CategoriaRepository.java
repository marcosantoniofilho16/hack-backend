package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {

}
