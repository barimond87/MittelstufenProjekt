/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

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
@Table(name = "question_bundle")
public class QuestionBundle extends AbstractPersistable<Integer> {

}
