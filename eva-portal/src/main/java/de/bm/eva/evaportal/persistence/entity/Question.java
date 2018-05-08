/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import de.bm.eva.evaportal.enums.QuestionType;

/**
 * @author benari
 *
 */
@Entity
@Table(name = "question")
public class Question extends AbstractPersistable<Integer> {

	@Column(name = "text")
	private String text;

	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private QuestionType type;

	@Column(name = "create_date")
	private LocalDateTime createDate;

	@OneToOne(optional = false)
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;

	@Column(name = "public_flag")
	private Boolean publicFlag;

	@Column(name = "category")
	private String category;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public QuestionType getType() {
		return type;
	}

	public void setType(QuestionType type) {
		this.type = type;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Boolean getPublicFlag() {
		return publicFlag;
	}

	public void setPublicFlag(Boolean publicFlag) {
		this.publicFlag = publicFlag;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
