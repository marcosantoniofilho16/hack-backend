package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Estabelecimento;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, UUID> {

}
