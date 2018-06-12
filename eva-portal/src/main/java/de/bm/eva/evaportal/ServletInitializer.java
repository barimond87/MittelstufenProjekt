package de.bm.eva.evaportal;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Marcel Vieren/ Ben Arimond
 */

/* Initiiert die Spring Boot Anwendung und lädt vorgefertigte Konfigurationen*/
public class ServletInitializer extends SpringBootServletInitializer {
	
	
	/* Hier wird die configure() Methode mit unserer Mainklasse überschrieben,
	 *  da diese von Spring beim Serverstart ausgeführt wird.*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EvaPortalApplication.class);
	}

}
