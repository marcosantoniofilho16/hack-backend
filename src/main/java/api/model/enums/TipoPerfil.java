package api.model.enums;

public enum TipoPerfil {
	
	ADM("ADM"),
	CLIENT("CLIENT"),
	VENDOR("VENDOR"),
	VISITOR("VISITOR");
	
	private String descricao;

	private TipoPerfil(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
