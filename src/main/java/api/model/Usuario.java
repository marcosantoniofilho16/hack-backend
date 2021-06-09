package api.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import api.model.enums.Linguagem;
import api.model.enums.TipoPerfil;

@Entity
public class Usuario extends AbstractEntity implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;

	private String sobrenome;

	@CPF
	@Column(unique = true)
	private String cpf;

	@Email
	@Column(unique = true, nullable = false)
	private String email;

	private String senha;

	@Enumerated(EnumType.STRING)
	private TipoPerfil tipoPerfil;

	private Boolean enabled = true;	
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Linguagem linguagem;
	
	@OneToOne
	private Endereco enderecoPadrao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoPerfil getTipoPerfil() {
		return tipoPerfil;
	}

	public void setTipoPerfil(TipoPerfil tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

	public Linguagem getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(Linguagem linguagem) {
		this.linguagem = linguagem;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();

		if (TipoPerfil.ADM.equals(tipoPerfil))
			authorities.add(new SimpleGrantedAuthority("ROLE_ADM"));
		else if (TipoPerfil.CLIENT.equals(tipoPerfil))
			authorities.add(new SimpleGrantedAuthority("ROLE_CLIENT"));
		else if (TipoPerfil.VENDOR.equals(tipoPerfil))
			authorities.add(new SimpleGrantedAuthority("ROLE_VENDOR"));
		else
			authorities.add(new SimpleGrantedAuthority("ROLE_VISITOR"));

		return authorities;
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
