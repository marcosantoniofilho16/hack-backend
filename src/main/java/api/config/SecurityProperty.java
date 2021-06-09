package api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SecurityProperty {
	
	@Value("${security.enabled}")	
	private Boolean enabled;
	
	@Value("${security.enable-https}")	
	private Boolean enableHttps;

	@Value("${security.cli}")
	private String cli;
	
	@Value("${security.cli2}")
	private String cli2;

	@Value("${security.secret}")
	private String secret;

	@Value("${security.signing-key}")
	private String signingKey;

	@Value("${security.access-token-validity-seconds}")
	private int accessTokenValiditySeconds;
	
	@Value("${security.refresh-token-validity-seconds}")
	private int refreshTokenValiditySeconds;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getEnableHttps() {
		return enableHttps;
	}

	public void setEnableHttps(Boolean enableHttps) {
		this.enableHttps = enableHttps;
	}

	public String getCli() {
		return cli;
	}

	public void setCli(String cli) {
		this.cli = cli;
	}

	public String getCli2() {
		return cli2;
	}

	public void setCli2(String cli2) {
		this.cli2 = cli2;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getSigningKey() {
		return signingKey;
	}

	public void setSigningKey(String signingKey) {
		this.signingKey = signingKey;
	}

	public int getAccessTokenValiditySeconds() {
		return accessTokenValiditySeconds;
	}

	public void setAccessTokenValiditySeconds(int accessTokenValiditySeconds) {
		this.accessTokenValiditySeconds = accessTokenValiditySeconds;
	}

	public int getRefreshTokenValiditySeconds() {
		return refreshTokenValiditySeconds;
	}

	public void setRefreshTokenValiditySeconds(int refreshTokenValiditySeconds) {
		this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
	}

}
