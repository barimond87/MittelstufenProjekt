package de.bm.eva.evaportal.config;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Ben Arimond
 */

/* Beim Starten der Applikation wird nach Dateien mit der Annotation @Configuration gesucht, mit der
 * verschiedene Teile der Applikation konfiguriert werden können.
 * In diesem Fall handelt es sich um eine WebSecurity Konfiguration zum verhindern von unerlaubten
 * Zugriffen auf die Applikation. Dafür wird ein WebSecurityConfigurerAdapter eingebunden und dessen configure() Methode
 * überschrieben. Beim Componentscan wird diese Konfigurationsklasse aufgenommen und die configure() Methode ausgeführt.
 */

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  implements ApplicationContextAware{

	
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/").permitAll();
	}

}

