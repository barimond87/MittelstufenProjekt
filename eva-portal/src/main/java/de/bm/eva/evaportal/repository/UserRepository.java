package de.bm.eva.evaportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.bm.eva.evaportal.persistence.entity.User;


/* Klasse zum Kommunizieren mit der Datenbank
 * die Klasse JpaRepository bringt Funktionen mit
 * um die Entitäten aus der Datenbank zu holen */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	/*
	 * Modifizierte SQL Query
	 * Liquibase wandelt diese Funktion in eine SQL Query
	 * */
	public User findByUsername(String username);
	
}
