package de.bm.eva.evaportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import de.bm.eva.evaportal.persistence.entity.Teacher;
import de.bm.eva.evaportal.repository.ITeacherRepository;
import liquibase.integration.spring.SpringLiquibase;

@SpringBootApplication
@ComponentScan("de.bm.eva.evaportal")
public class EvaPortalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EvaPortalApplication.class, args);
	}
}
