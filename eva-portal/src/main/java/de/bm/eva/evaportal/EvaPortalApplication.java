package de.bm.eva.evaportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Marcel Vieren/ Ben Arimond
 */

/* Einstiegspunkt der Applikation
 * Spring Boot führt einen "Componentscan" auf alle Packages durch und sammelt alle Komponenten die mit Annotationen 
 * makiert wurden und registriert diese als "Singeltons" im Applikationskontext
 */


@SpringBootApplication /* Java Spring Annotation, die diese Klasse als Mainklasse makiert */
public class EvaPortalApplication {
	
	public static void main(String[] args) {
		/* Spring wird die Applikation zum starten übergeben */
		SpringApplication.run(EvaPortalApplication.class, args);
	}
}
