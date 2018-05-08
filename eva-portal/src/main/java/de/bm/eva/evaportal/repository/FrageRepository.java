/**
 * 
 */
package de.bm.eva.evaportal.repository;

import org.springframework.data.repository.CrudRepository;

import de.bm.eva.evaportal.persistence.entity.Question;

/**
 * @author benari
 *
 */
public interface FrageRepository extends CrudRepository<Question, Long> {

}