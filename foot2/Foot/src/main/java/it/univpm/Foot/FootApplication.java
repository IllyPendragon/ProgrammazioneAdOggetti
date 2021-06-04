package it.univpm.Foot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe che avvia SpringBoot e il relativo web service sulla porta 8080
 * 
 */

@SpringBootApplication
public class FootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootApplication.class, args);
	}

}
