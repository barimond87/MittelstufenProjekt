package de.bm.eva.evaportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bm.eva.evaportal.model.UserLogin;
import de.bm.eva.evaportal.persistence.entity.User;
import de.bm.eva.evaportal.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;

	public UserLogin login(String username, String password) {

		User user = userRepository.findByUsername(username);

		System.out.println(user.getUsername());

		return null;

	}

}
