/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author benari
 *
 */
@Entity
@Table(name = "teacher")
public class Teacher extends AbstractPersistable<Integer>{
	
	
	
}