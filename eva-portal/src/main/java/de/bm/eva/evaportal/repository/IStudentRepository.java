/**
 * 
 */
package de.bm.eva.evaportal.repository;

import org.springframework.data.repository.CrudRepository;

import de.bm.eva.evaportal.persistence.entity.Question;
import de.bm.eva.evaportal.persistence.entity.Student;

/**
 * @author benari
 *
 */
public interface IStudentRepository extends CrudRepository<Student, Long> {

}