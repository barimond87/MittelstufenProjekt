package de.bm.eva.evaportal.exceptions;

/**
 * @author Marcel Vieren
 */
/* Exception um Fehler im Login zu Melden */
public class LoginException extends RuntimeException {

	   public LoginException(String message) {
	        super(message);
	    }
}
