package api.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
		
	Optional<Usuario> findByEmail(String email);
	
}
