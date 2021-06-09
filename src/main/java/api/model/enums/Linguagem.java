package api.model.enums;

public enum Linguagem {
	
	PT_BR("pt-BR");
	
	private String descricao;

	private Linguagem(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
