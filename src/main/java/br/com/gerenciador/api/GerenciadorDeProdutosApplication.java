package br.com.gerenciador.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.gerenciador.api")
public class GerenciadorDeProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorDeProdutosApplication.class, args);
	}

}
