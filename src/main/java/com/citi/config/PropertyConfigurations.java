package com.citi.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="origin")
public class PropertyConfigurations {
	private List<String> allowedOrigin;

	public List<String> getAllowedOrigin() {
		return allowedOrigin;
	}

	public void setAllowedOrigin(List<String> allowedOrigin) {
		this.allowedOrigin = allowedOrigin;
	}
	
	

}
