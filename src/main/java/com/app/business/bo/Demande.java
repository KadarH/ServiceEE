package com.app.business.bo;

public class Demande {

	private Long id;
	private String message;
	private User user;
	private String type;
	private Boolean etat;

	public Long getId() {
		return id;
	}

	// ****************** CONSTRUCTEURS ******************************

	public Demande() {

	}

	public Demande(String message, User userEm, User userRe, Boolean etat) {
		super();
		this.message = message;
		this.user = userEm;
		this.etat = etat;
	}

	// ****************** Getters and setters ******************************

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
	
}
