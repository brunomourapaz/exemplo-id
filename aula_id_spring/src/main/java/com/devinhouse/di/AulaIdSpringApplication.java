package com.devinhouse.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// A anotação @SpringBootApplication 
// define que todas as classes com anotações do spring deste pacote e subpacotes serão escaneadas pelo spring
@SpringBootApplication   
public class AulaIdSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaIdSpringApplication.class, args);
	}

}
