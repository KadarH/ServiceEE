package com.app.business.bo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
 @Table(name="RENDEZVOUS")
public class RendezVous {

	@Id
	@GeneratedValue
	@Column(name = "idRendezVous")
	private Long id;
	
	private String message;
	private String etat;

	private String dateRendezVous;

	@ManyToOne
	@JoinColumn(name = "idUser_dem")
	private User userdem;
	
	
	@ManyToOne
	@JoinColumn(name = "idUser_rec")
	private User userrec;

	public RendezVous() {
		super();
	}

	public RendezVous(String message, String etat) {
		super();
		this.message = message;
		this.etat = etat;
	}

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

}
