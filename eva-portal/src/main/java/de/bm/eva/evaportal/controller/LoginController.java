package de.bm.eva.evaportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import de.bm.eva.evaportal.model.UserLogin;
import de.bm.eva.evaportal.services.LoginService;

/**
 * @author Marcel Vieren
 */



/* WebController - verarbeitet HTTP-Anfragen.
 * @Controller Annotation registriert diese Klasse als Controller beim Componentscan.
 * @RequestMapping("/login") Annotation bestimmt die Url des Controllers.In diesem Fall (serverUrl)/login
 * */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	/* Zieht die Instanz des LoginServices aus dem Applikationskontext. Jeder @Service wird nur einmal im
	 * Arbeitsspeicher abgelegt und durch die @Autowired Annotation in beliebige Klassen geladen.*/
	@Autowired
	private LoginService loginService;
	
	/* @PostMapping Annotation legt die Url der Schnittstelle fest
	 *  sowie die Http-Methode mit der sie angesprochen wird. Hier wird die Http-Post Methode gefordert 
	 *  @Validated @RequestBody(required = true) UserLogin userLogin bestimmt weitere Anforderungen
	 *  an die HTTP-Anfrage. In diesem Fall wird ein UserLogin Objekt, das im Body der Anfrage übertragen wird, 
	 *  erwartet.
	 *  */
	@PostMapping("/")
	public String login(@Validated @RequestBody(required = true) UserLogin userLogin) {
		/* Die Login Funktion des LoginServices wird aufgerufen mit den Daten aus dem UserLogin
		 * Objekt. Rückgegeben wird eine HTML-Seite als String*/
		String loginPage = loginService.login(userLogin.getUsername(), userLogin.getPassword());
		return loginPage;
	}
	

}