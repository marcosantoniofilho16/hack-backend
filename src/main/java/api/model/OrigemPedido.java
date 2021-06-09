package api.model;

import javax.persistence.Entity;

@Entity
public class OrigemPedido extends AbstractEntity {
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
