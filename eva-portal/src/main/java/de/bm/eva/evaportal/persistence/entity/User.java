/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author marvie
 *
 */
@Entity
@Table(name = "user")
public class User extends AbstractPersistable<Integer> {

	@Column(name = "username")
	private String username;

	@Column(name = "passwort")
	private String passwort;

	@OneToOne(optional = true)
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;

	@OneToOne(optional = true)
	@JoinColumn(name = "student_id")
	private Student student;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
