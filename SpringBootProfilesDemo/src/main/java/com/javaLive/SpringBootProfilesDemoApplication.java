package com.javaLive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringBootProfilesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesDemoApplication.class, args);
	}

}
