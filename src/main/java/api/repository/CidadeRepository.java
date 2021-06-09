package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, UUID> {

}
