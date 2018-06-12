/**
 * 
 */
package de.bm.eva.evaportal.repository;

import org.springframework.data.repository.CrudRepository;

import de.bm.eva.evaportal.persistence.entity.Teacher;

/**
 * @author Ben Arimond
 *
 */
/* Klasse zum Kommunizieren mit der Datenbank
 * die Klasse JpaRepository bringt Funktionen mit
 * um die Entitäten aus der Datenbank zu holen */

public interface ITeacherRepository extends CrudRepository<Teacher, Long> {

}