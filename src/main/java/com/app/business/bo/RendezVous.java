package com.app.business.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "RENDEZVOUS")
public class RendezVous {

	@Id
	@GeneratedValue
	private Long id;
	private String message;
	private String etat;

	@DateTimeFormat
	private String dateRendezVous;

	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	private User userdem;

	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	private User userrec;

	// *************************************************
	// **************** Constructeur ***************
	// *************************************************

	public RendezVous() {
		super();
	}

	// *************************************************
	// **************** Getters And Setters ***************
	// *************************************************

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public User getUserdem() {
		return userdem;
	}

	public void setUserdem(User userdem) {
		this.userdem = userdem;
	}

	public User getUserrec() {
		return userrec;
	}

	public void setUserrec(User userrec) {
		this.userrec = userrec;
	}

	public String getDateRendezVous() {
		return dateRendezVous;
	}

	public void setDateRendezVous(String dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RendezVous [id=");
		builder.append(id);
		builder.append(", message=");
		builder.append(message);
		builder.append(", etat=");
		builder.append(etat);
		builder.append(", dateRendezVous=");
		builder.append(dateRendezVous);
		builder.append(", userdem=");
		builder.append(userdem);
		builder.append(", userrec=");
		builder.append(userrec);
		builder.append("]");
		return builder.toString();
	}
	
	

}
