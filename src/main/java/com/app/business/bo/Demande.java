package com.app.business.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEMANDE")
public class Demande {

	@Id
	@GeneratedValue
	private Long id;
	private String message;
	private String type;
	private Boolean etat;
	private String date;

	@ManyToOne
	private User user;

	public Long getId() {
		return id;
	}

	// *************************************************
	// **************** Constructeur *******************
	// *************************************************

	public Demande() {
		super();
	}

	// *************************************************
	// **************** Getters And Setters ************
	// *************************************************

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUserEm() {
		return user;
	}

	public void setUserEm(User userEm) {
		this.user = userEm;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Demande [id=");
		builder.append(id);
		builder.append(", message=");
		builder.append(message);
		builder.append(", type=");
		builder.append(type);
		builder.append(", etat=");
		builder.append(etat);
		builder.append(", date=");
		builder.append(date);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	
	

}
