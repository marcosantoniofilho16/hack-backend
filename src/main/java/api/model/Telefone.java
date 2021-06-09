package api.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Telefone extends AbstractEntity {
	
	private String numero;
	
	private Boolean isWhatsapp;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Estabelecimento estabelecimento;

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Boolean getIsWhatsapp() {
		return isWhatsapp;
	}

	public void setIsWhatsapp(Boolean isWhatsapp) {
		this.isWhatsapp = isWhatsapp;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
