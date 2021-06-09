package api.model;

import javax.persistence.Entity;

@Entity
public class Categoria extends AbstractEntity {
	
	private String descricao;
	
	private String teste;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

}
