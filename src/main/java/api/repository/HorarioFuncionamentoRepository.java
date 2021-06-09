package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.HorarioFuncionamento;

public interface HorarioFuncionamentoRepository extends JpaRepository<HorarioFuncionamento, UUID> {

}
