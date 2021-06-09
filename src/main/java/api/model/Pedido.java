package api.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import api.model.enums.StatusPedido;
import api.model.enums.TipoEntrega;

@Entity
public class Pedido extends AbstractEntity {
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	private String observacao;
	
	@Enumerated(EnumType.STRING)
	private TipoEntrega tipoEntrega;
	
	private LocalDateTime data;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Estabelecimento estabelecimento;
	
	@ManyToOne
	private Endereco endereco;
	
	@ManyToOne
	private MeioPagamento meioPagamento;
	
	private BigDecimal valor;
	
	@ManyToOne
	private OrigemPedido origemPedido;

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoEntrega getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(TipoEntrega tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public MeioPagamento getMeioPagamento() {
		return meioPagamento;
	}

	public void setMeioPagamento(MeioPagamento meioPagamento) {
		this.meioPagamento = meioPagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public OrigemPedido getOrigemPedido() {
		return origemPedido;
	}

	public void setOrigemPedido(OrigemPedido origemPedido) {
		this.origemPedido = origemPedido;
	}

}
