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
 * @author marcelvieren
 */

/* Restcontroller - Hier werden die HTTP Anfragen mit den bekannten Methoden (CRUD) verarbeitet
 */

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/")
	public String login(@Validated @RequestBody(required = true) UserLogin userLogin) {
		String loginPage = loginService.login(userLogin.getUsername(), userLogin.getPassword());
		return loginPage;
	}
	

}