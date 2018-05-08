/**
 * 
 */
package de.bm.eva.evaportal.repository;

import org.springframework.data.repository.CrudRepository;

import de.bm.eva.evaportal.persistence.entity.Question;
import de.bm.eva.evaportal.persistence.entity.Teacher;

/**
 * @author benari
 *
 */
public interface ITeacherRepository extends CrudRepository<Teacher, Long> {

}