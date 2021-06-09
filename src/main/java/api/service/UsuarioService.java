package api.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import api.model.Usuario;
import api.repository.UsuarioRepository;

@Service
public class UsuarioService extends AbstractService<UsuarioRepository, Usuario, UUID> implements UserDetailsService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	@SuppressWarnings("unchecked")
	public Usuario save(Usuario usuario) {
		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		return this.repository.save(usuario);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.repository.findByEmail(username)
				.orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrato"));
	}

}
