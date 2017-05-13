package com.app.business.bo;

import java.util.List;

public class User {

	private Long id;
	private String username;
	private String password;
	private Role role;
	private List<Entretien> listEntretien;
	private List<RendezVous> listRendezVous;
	private List<Demande> listDemande;
	private List<User> listCollaborateur;
	private List<User> listResponsable;
	

	public User(String username, String password, Role role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Entretien> getListEntretien() {
		return listEntretien;
	}

	public void setListEntretien(List<Entretien> listEntretien) {
		this.listEntretien = listEntretien;
	}

	public List<RendezVous> getListRendezVous() {
		return listRendezVous;
	}

	public void setListRendezVous(List<RendezVous> listRendezVous) {
		this.listRendezVous = listRendezVous;
	}

	public List<Demande> getListDemande() {
		return listDemande;
	}

	public void setListDemande(List<Demande> listDemande) {
		this.listDemande = listDemande;
	}

	public List<User> getListCollaborateur() {
		return listCollaborateur;
	}

	public void setListCollaborateur(List<User> listCollaborateur) {
		this.listCollaborateur = listCollaborateur;
	}

	public List<User> getListResponsable() {
		return listResponsable;
	}

	public void setListResponsable(List<User> listResponsable) {
		this.listResponsable = listResponsable;
	}

	
}
