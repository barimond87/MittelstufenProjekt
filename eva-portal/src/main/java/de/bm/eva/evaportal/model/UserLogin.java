package de.bm.eva.evaportal.model;

import javax.validation.constraints.NotNull;


/**
 * @author Marcel Vieren/ Ben Arimond
 */

/* UserLogin ist eine Klasse um die Anmeldedaten im Controller entgegen zunehmen und zu speichern  */
public class UserLogin {
	@NotNull
	private String username;
	@NotNull
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
