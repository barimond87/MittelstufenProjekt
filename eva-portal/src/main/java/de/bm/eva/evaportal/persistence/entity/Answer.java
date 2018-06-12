/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author Ben Arimond
 *
 */

/* Entity Klasse
 * Liquibase legt eine DB-Tabelle entsprechend der Klasse an*/

@Entity
@Table(name = "answer")//Legt den Tabellennamen fest
public class Answer extends AbstractPersistable<Integer> {

	@Column(name = "text")//Legt Spaltennamen fest
	private String text;
	
	@OneToOne//Legt Foreignkeybeziehung wird fest
	@JoinColumn(name = "question_id")//Legt Foreignkeybeziehung wird fest
	private Question question;
	
	@ManyToOne//Legt Foreignkeybeziehung wird fest
	@JoinColumn(name = "question_bundle_id")//Legt Foreignkeybeziehung wird fest
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
