package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.PedidoAdicional;

public interface PedidoAdicionalRepository extends JpaRepository<PedidoAdicional, UUID> {

}
