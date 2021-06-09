package api.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PedidoAdicional extends AbstractEntity {
	
	@ManyToOne
	private OpcionalProduto opcionalProduto;
	
	@ManyToOne
	private Pedido pedido;
	
	private BigDecimal valor;

	public OpcionalProduto getOpcionalProduto() {
		return opcionalProduto;
	}

	public void setOpcionalProduto(OpcionalProduto opcionalProduto) {
		this.opcionalProduto = opcionalProduto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
