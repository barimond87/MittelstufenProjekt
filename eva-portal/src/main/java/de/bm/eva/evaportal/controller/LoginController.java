package de.bm.eva.evaportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.bm.eva.evaportal.model.UserLogin;
import de.bm.eva.evaportal.services.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/")
	public ResponseEntity<UserLogin> login(@Validated @RequestBody(required = true) UserLogin userLogin) {
		System.out.println("Hat funktioniert");
		UserLogin login = loginService.login(userLogin.getUsername(), userLogin.getPassword());
		return new ResponseEntity<>(login, HttpStatus.OK);
	}

}