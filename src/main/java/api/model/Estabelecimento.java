package api.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Estabelecimento extends AbstractEntity {
	
	private String nome;
	
	private String cnpj;
	
	@Column(unique = true)
	private String url;
	
	private Boolean isDelivery;
	
	private Boolean isRetirada;
	
	private BigDecimal valorEntrega;
	
	private BigDecimal pedidoMinimo;
	
	private Boolean isMostrarTelefone;
	
	private String instagram;
	
	private String facebook;
	
	@CreatedDate
	private LocalDateTime dataCadastro;
	
	@ManyToOne
	private Endereco endereco;
	
	@ManyToOne
	private TipoEstabelecimento tipoEstabelecimento;
	
	@ManyToMany
	private List<MeioPagamento> meiosDePagamento;

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getIsDelivery() {
		return isDelivery;
	}

	public void setIsDelivery(Boolean isDelivery) {
		this.isDelivery = isDelivery;
	}

	public Boolean getIsRetirada() {
		return isRetirada;
	}

	public void setIsRetirada(Boolean isRetirada) {
		this.isRetirada = isRetirada;
	}

	public BigDecimal getValorEntrega() {
		return valorEntrega;
	}

	public void setValorEntrega(BigDecimal valorEntrega) {
		this.valorEntrega = valorEntrega;
	}

	public BigDecimal getPedidoMinimo() {
		return pedidoMinimo;
	}

	public void setPedidoMinimo(BigDecimal pedidoMinimo) {
		this.pedidoMinimo = pedidoMinimo;
	}

	public Boolean getIsMostrarTelefone() {
		return isMostrarTelefone;
	}

	public void setIsMostrarTelefone(Boolean isMostrarTelefone) {
		this.isMostrarTelefone = isMostrarTelefone;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoEstabelecimento getTipoEstabelecimento() {
		return tipoEstabelecimento;
	}

	public void setTipoEstabelecimento(TipoEstabelecimento tipoEstabelecimento) {
		this.tipoEstabelecimento = tipoEstabelecimento;
	}

	public List<MeioPagamento> getMeiosDePagamento() {
		return meiosDePagamento;
	}

	public void setMeiosDePagamento(List<MeioPagamento> meiosDePagamento) {
		this.meiosDePagamento = meiosDePagamento;
	}
	
}
