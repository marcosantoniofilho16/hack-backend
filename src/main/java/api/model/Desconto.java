package api.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Desconto extends AbstractEntity {
		
	private Boolean isAtivo;
	
	@ManyToOne
	private Promocao promocao;
	
	@ManyToOne
	private Produto produto;

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public Promocao getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
