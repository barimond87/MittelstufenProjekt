package de.bm.eva.evaportal.config;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Ben Arimond
 */

/* Beim Starten der Applikation wird nach einer Datei mit der Annotation @Configuration gesucht, mit der
 * die Anwendung Konfiguriert werden kann
 */

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  implements ApplicationContextAware{

	//?
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/").permitAll();
	}

}
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.authorizeRequests().antMatchers("/").permitAll();
//	}
//	
//}
