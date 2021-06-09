package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

}
