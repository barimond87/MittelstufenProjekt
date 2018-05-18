/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author benari
 *
 */
@Entity
@Table(name = "student")
public class Student extends AbstractPersistable<Integer>{

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "class_id")
	Class schoolClass;

	public String getVorname() {
		return firstName;
	}

	public void setVorname(String vorname) {
		this.firstName = vorname;
	}

	public String getNachname() {
		return name;
	}

	public void setNachname(String nachname) {
		this.name = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Class getKlasse() {
		return schoolClass;
	}

	public void setKlasse(Class klasse) {
		this.schoolClass = klasse;
	}

}
