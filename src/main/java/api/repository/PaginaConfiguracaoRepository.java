package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.PaginaConfiguracao;

public interface PaginaConfiguracaoRepository extends JpaRepository<PaginaConfiguracao, UUID> {

}
