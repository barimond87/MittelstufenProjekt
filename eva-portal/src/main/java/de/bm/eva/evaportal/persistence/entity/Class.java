/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author Ben Arimond
 *
 */
/* Entity Klasse
 * Liquibase legt eine DB-Tabelle entsprechend der Klasse an
 * Erklärung der Annotations siehe Answer.java*/

@Entity
@Table(name = "class")
public class Class extends AbstractPersistable<Integer> {

	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
