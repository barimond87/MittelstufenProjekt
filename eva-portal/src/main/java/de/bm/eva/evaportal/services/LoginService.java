package de.bm.eva.evaportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bm.eva.evaportal.exceptions.LoginExeption;
import de.bm.eva.evaportal.persistence.entity.User;
import de.bm.eva.evaportal.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;

	public User login(String username, String password) {

		User user = userRepository.findByUsername(username);
		
		if(user==null) {
		throw new LoginExeption("Nutzer nicht vorhanden.");
		}
		
		if(!checkLogin(user, password)) {
			throw new LoginExeption("Password nicht korrekt.");
		}
		
		System.out.println(user.getUsername());

		return user;

	}

	private boolean checkLogin(User user, String password) {
		return user.getPasswort().equals(password);
	}

}
