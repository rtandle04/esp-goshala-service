package com.goshala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.goshala.*")
public class EspGoshalaServiceApplication {

	public static void main(String[] args) {
		System.out.println("spring boot");
		SpringApplication.run(EspGoshalaServiceApplication.class, args);
	}

}
