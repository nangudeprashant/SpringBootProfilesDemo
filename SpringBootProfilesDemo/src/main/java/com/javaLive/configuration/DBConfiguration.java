package com.javaLive.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties(prefix= "spring.datasource")
public class DBConfiguration {
	private String driverClassName;
	private String url;
	private String userName;
	private String password;
	
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Profile("dev")
	@Bean
	public String devMailDetails() {
		System.out.println("Database related information for test evoirment");
		System.out.println(url);
		return "Data for dev envoirment";
	}
	@Profile("test")
	@Bean
	public String testMailDetails() {
		System.out.println("Database related information for test evoirment");
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(userName);
		System.out.println(password);
		return "Data for test envoirment";
	}
}
