package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, UUID> {

}
