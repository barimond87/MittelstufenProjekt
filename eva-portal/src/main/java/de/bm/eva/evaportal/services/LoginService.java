package de.bm.eva.evaportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bm.eva.evaportal.exceptions.LoginException;
import de.bm.eva.evaportal.persistence.entity.User;
import de.bm.eva.evaportal.repository.UserRepository;

/**
 * @author Marcel Vieren
 * */

/*
 * LoginService als Verbindung zwischen Datenbank und Controller 
 * Dieser Service prüft die Einlog Daten und gibt die verschieden HTML-Pages aus
 * */

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;/* Zieht die Instanz des Repositorys in den Klassenkontext */
	
	/*Funktion wird von Controller mit den LogIn-Daten aufgerufen
	 * und versucht diesen User in der Datenbank zu finden
	 * und gibts
	 * */
	public String login(String username, String password) {
		String template;
		/* User wird in der Datenbank abgefragt */
		User user = userRepository.findByUsername(username);
		
		/* Prüft ob Datenbankabfrage erfolgreich war */
		checkLogin(user, password);
		
		System.out.println(user.getUsername());
		
		/* Holt das Html Template für die jeweilige Userkategorie */
		template =getTemplate(user);
		
		/* Rückgabe der HTML-Page */
		return template;

	}
	
	/* Prüft auf richtige Angaben des Nutzers */
	private void checkLogin(User user, String password) {
		/* Prüft ob der Nutzer in der Datenbank zufinden war */
		if(user==null) {
			throw new LoginException("Fehler - Nutzer nicht vorhanden.");
			}
		/* Prüft ob das angegebene Passwort zu dem des Users aus der Datenbank passt*/
		if (!user.getPasswort().equals(password)) {
			throw new LoginException("Fehler - Password nicht korrekt.");
		}
		/* Prüft ob dem User eine Benutzerrolle zugeordnet ist */
		if(user.getStudent()==null && user.getTeacher()==null) {
			throw new LoginException("Fehler - Nutzerart nicht bekannt.");
		}
	}

	/* Entscheidet welcher Benutzertyp welche HTML-Page ausgelieft bekommt */
	private String getTemplate(User user) {
		if(user.getTeacher()!=null) {
			return "teacher";
		}else {
			return "student";
		}
	}


}
