package de.bm.eva.evaportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
  
	@GetMapping("/hallo ")
	public void login() {
		System.out.println("Hat funktioniert");
	}
}
