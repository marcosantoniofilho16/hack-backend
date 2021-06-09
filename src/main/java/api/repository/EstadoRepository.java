package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, UUID> {

}
