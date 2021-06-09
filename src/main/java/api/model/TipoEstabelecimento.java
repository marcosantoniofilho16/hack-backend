package api.model;

import javax.persistence.Entity;

@Entity
public class TipoEstabelecimento extends AbstractEntity {
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
