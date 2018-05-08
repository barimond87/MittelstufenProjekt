/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author benari
 *
 */
@Entity
@Table(name = "answer")
public class Answer extends AbstractPersistable<Integer> {

	@Column(name = "text")
	private String text;

	@JoinColumn(name = "question_id")
	private Question question;

	@JoinColumn(name = "question_bundle_id")
	private QuestionBundle questionBundle;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public QuestionBundle getQuestionBundle() {
		return questionBundle;
	}

	public void setQuestionBundle(QuestionBundle questionBundle) {
		this.questionBundle = questionBundle;
	}

}