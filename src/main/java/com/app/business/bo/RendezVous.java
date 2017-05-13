package com.app.business.bo;

public class RendezVous {

	private Long id;
	private String message;
	private String etat;
	private User userdem;
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
	
}
