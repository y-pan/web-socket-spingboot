package com.example.socket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RestController
@SpringBootApplication

public class SocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocketApplication.class, args);
	}

	@GetMapping(path = "/")
	public String hello() {
		return "hello";
	}


	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*/**")
						.allowedOrigins(
								"*" // for postman
								, "http://localhost:3000" // local frontend
//								"http://pancodes.net:3000",
//								"http://pancodes.net:8081"
						)
						.allowedMethods("*")
						.allowedHeaders("*")
//						.exposedHeaders("header1", "header2")
//						.allowCredentials(false)
				;
			}
		};
	}

}
