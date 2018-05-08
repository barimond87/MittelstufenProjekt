package de.bm.eva.evaportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import liquibase.integration.spring.SpringLiquibase;

@SpringBootApplication
public class EvaPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaPortalApplication.class, args);
	}
}
