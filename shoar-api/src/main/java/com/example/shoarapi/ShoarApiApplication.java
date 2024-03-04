package com.example.shoarapi;

import com.example.shoarapi.configuration.security.ApiKeyInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ShoarApiApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ShoarApiApplication.class, args);
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(apiKeyInterceptor());
	}

	@Bean
	public ApiKeyInterceptor apiKeyInterceptor() {
		return new ApiKeyInterceptor();
	}
}
