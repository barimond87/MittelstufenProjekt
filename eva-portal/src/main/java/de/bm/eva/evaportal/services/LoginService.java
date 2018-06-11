package de.bm.eva.evaportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bm.eva.evaportal.exceptions.LoginException;
import de.bm.eva.evaportal.persistence.entity.User;
import de.bm.eva.evaportal.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;

	public String login(String username, String password) {
		String template;
		User user = userRepository.findByUsername(username);
		
		checkLogin(user, password);
		
		System.out.println(user.getUsername());
		
		template =getTemplate(user);
		
		return template;

	}

	private void checkLogin(User user, String password) {
		if(user==null) {
			throw new LoginException("Fehler - Nutzer nicht vorhanden.");
			}
		if (!user.getPasswort().equals(password)) {
			throw new LoginException("Fehler - Password nicht korrekt.");
		}
		if(user.getStudent()==null && user.getTeacher()==null) {
			throw new LoginException("Fehler - Nutzerart nicht bekannt.");
		}
	}

	private String getTemplate(User user) {
		if(user.getTeacher()!=null) {
			return "teacher";
		}else {
			return "student";
		}
	}


}
