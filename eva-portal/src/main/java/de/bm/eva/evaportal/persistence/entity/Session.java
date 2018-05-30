/**
 * 
 */
package de.bm.eva.evaportal.persistence.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
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
@Table(name = "session_token")
public class Session extends AbstractPersistable<Long> {

	@Column(name = "token")
	private String token;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
