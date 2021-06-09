package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, UUID> {

}
