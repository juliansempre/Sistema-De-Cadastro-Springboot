package com.example.sistemaDeLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class SistemaDeLoginApplication {

	public static void main(String[] args) {

		SpringApplication.run(SistemaDeLoginApplication.class, args);
		System.out.println("Conectado na porta 8080");
	}

}
