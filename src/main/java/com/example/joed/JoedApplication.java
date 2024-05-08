package com.example.joed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@Controller
@EnableCaching
@OpenAPIDefinition(
	info = @Info(
		title = "Projeto Joed",
		summary = "API rest do projeto Joed",
		description = "Um gestor de loja"
	)
)
public class JoedApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoedApplication.class, args);
	}

	

}
