package com.example.JokesApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
public class JokesApplication {

	public static void main(String[] args) {

		SpringApplication.run(JokesApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){

		return new RestTemplate();
	}

}
