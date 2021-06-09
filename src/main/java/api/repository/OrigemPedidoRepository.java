package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.OrigemPedido;

public interface OrigemPedidoRepository extends JpaRepository<OrigemPedido, UUID> {

}
