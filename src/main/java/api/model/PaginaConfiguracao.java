package api.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import api.model.enums.Layout;

@Entity
public class PaginaConfiguracao extends AbstractEntity {
	
	private String navColor;
	
	private String primaryColor;
	
	private String secundaryColor;
	
	private String backgroundColor;
	
	private String backgroundImage;
	
	private String bannerImage;
	
	@Enumerated(EnumType.STRING)
	private Layout layout;
	
	private String logoImage;
	
	private Boolean cadAutoPedidoExterno = true;
	
	@ManyToOne
	private Estabelecimento estabelecimento;

	public String getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	public String getSecundaryColor() {
		return secundaryColor;
	}

	public void setSecundaryColor(String secundaryColor) {
		this.secundaryColor = secundaryColor;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public String getLogoImage() {
		return logoImage;
	}

	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}

	public Boolean getCadAutoPedidoExterno() {
		return cadAutoPedidoExterno;
	}

	public void setCadAutoPedidoExterno(Boolean cadAutoPedidoExterno) {
		this.cadAutoPedidoExterno = cadAutoPedidoExterno;
	}

	public String getNavColor() {
		return navColor;
	}

	public void setNavColor(String navColor) {
		this.navColor = navColor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public Layout getLayout() {
		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}
