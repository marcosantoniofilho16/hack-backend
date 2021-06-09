package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Desconto;

public interface DescontoRepository extends JpaRepository<Desconto, UUID> {

}
