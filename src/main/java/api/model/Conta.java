package api.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Conta extends AbstractEntity {
	
	private String nome;
	
	private String usuarioAdmin;
	
	private Boolean isAtivo = true;
	
	@CreatedDate
	private LocalDateTime dataCadastro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuarioAdmin() {
		return usuarioAdmin;
	}

	public void setUsuarioAdmin(String usuarioAdmin) {
		this.usuarioAdmin = usuarioAdmin;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
