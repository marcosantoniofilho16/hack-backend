package api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;

@Configuration
public class GeoContextApiConfig {
	
	private static final String apiKey = "abc";

	@Bean
	public GeoApiContext configGeoApiContext() {
		return new GeoApiContext
				.Builder()
				.apiKey(apiKey)
				.build();
	}
	
	@Bean
	public Gson configGson() {
		return new GsonBuilder()
				.setPrettyPrinting()
				.create();
	}
	
}
