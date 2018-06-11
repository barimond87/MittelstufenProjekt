package de.bm.eva.evaportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.bm.eva.evaportal.persistence.entity.User;
import de.bm.eva.evaportal.services.LoginService;

/**
 * @author marcelvieren
 */

/* Restcontroller - Hier werden die HTTP Anfragen mit den bekannten Methoden (CRUD) verarbeitet
 */

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/")
	public ResponseEntity<User> login(@Validated @RequestBody(required = true) User userLogin) {
		User login = loginService.login(userLogin.getUsername(), userLogin.getPasswort());
		return new ResponseEntity<>(login, HttpStatus.OK);
	}

}