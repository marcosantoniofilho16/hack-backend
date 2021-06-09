package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.TipoEstabelecimento;

public interface TipoEstabelecimentoRepository extends JpaRepository<TipoEstabelecimento, UUID> {

}
