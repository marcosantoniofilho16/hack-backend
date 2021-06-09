package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.MeioPagamento;

public interface MeioPagamentoRepository extends JpaRepository<MeioPagamento, UUID> {

}
