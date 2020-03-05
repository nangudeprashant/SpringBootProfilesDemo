package com.javaLive.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties(prefix= "mail")
public class DBConfiguration {
	private String hostname;
	private String port;
	private String from;
	
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		System.out.println("Mail related information for Dev evoirment");
		System.out.println(hostname);
		System.out.println(port);
		System.out.println(from);
		return "Data for dev envoirment";
	}
	@Profile("test")
	@Bean
	public String testDatabaseConnection() {
		System.out.println("Mail related information for test evoirment");
		System.out.println(hostname);
		System.out.println(port);
		System.out.println(from);
		return "Data for test envoirment";
	}

}