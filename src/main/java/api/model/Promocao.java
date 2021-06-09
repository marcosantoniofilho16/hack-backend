package api.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import api.model.enums.Regra;
import api.model.enums.TipoDesconto;

@Entity
public class Promocao extends AbstractEntity {
		
	@Enumerated(EnumType.STRING)
	private TipoDesconto tipoDesconto;
	
	private Boolean isAtivo;
	
	@ManyToOne
	private Categoria categoria;
	
	@Enumerated(EnumType.STRING)
	private Regra regra;
	
	private String imagem;
	
	private BigDecimal valor;

	public TipoDesconto getTipoDesconto() {
		return tipoDesconto;
	}

	public void setTipoDesconto(TipoDesconto tipoDesconto) {
		this.tipoDesconto = tipoDesconto;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Regra getRegra() {
		return regra;
	}

	public void setRegra(Regra regra) {
		this.regra = regra;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
