package api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {

}
