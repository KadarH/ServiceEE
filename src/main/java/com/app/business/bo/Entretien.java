package com.app.business.bo;

import java.util.List;

public class Entretien {

	private Long id;
	private String label;
	// autres
	private String etat;
	private List<Objectif> listObjectif;
	private User collaborateur;
	private User responsable;

	// ***************************************
	public Entretien(String label, String etat, User collaborateur, User responsable) {
		super();
		this.label = label;
		this.etat = etat;
		this.collaborateur = collaborateur;
		this.responsable = responsable;
	}
	
	
	public Entretien() {
		super();
	}


	public Long getId() {
		return id;
	}

	

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public List<Objectif> getListObjectif() {
		return listObjectif;
	}

	public void setListObjectif(List<Objectif> listObjectif) {
		this.listObjectif = listObjectif;
	}

	public User getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(User collaborateur) {
		this.collaborateur = collaborateur;
	}

	public User getResponsable() {
		return responsable;
	}

	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}

}
