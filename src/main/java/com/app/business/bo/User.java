package com.app.business.bo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	private String nom;
	private String prenom;
	private String Adresse;
	private String etat;
	private boolean enabled = true;
	private boolean accountNotExpired = true;
	private boolean accountNotLocked = true;
	private Date lastAccessDate;

	@ManyToOne
	private Role role;

	@OneToMany(mappedBy = "userdem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<RendezVous> listRendezVous;

	@OneToMany(mappedBy = "userrec", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<RendezVous> listaRendezVous;

	@OneToMany(mappedBy = "responsable", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Entretien> listEntretienResp;

	@OneToMany(mappedBy = "collaborateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Entretien> listEntretienColl;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Demande> listDemande;
	

	@Column(name = "email", unique = true, nullable = false, length = 100)
	private String email;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public List<RendezVous> getListRendezVous() {
		return listRendezVous;
	}

	public void setListRendezVous(List<RendezVous> listRendezVous) {
		this.listRendezVous = listRendezVous;
	}

	public List<RendezVous> getListaRendezVous() {
		return listaRendezVous;
	}

	public void setListaRendezVous(List<RendezVous> listaRendezVous) {
		this.listaRendezVous = listaRendezVous;
	}

	public List<Entretien> getListEntretienResp() {
		return listEntretienResp;
	}

	public void setListEntretienResp(List<Entretien> listEntretienResp) {
		this.listEntretienResp = listEntretienResp;
	}

	public List<Entretien> getListEntretienColl() {
		return listEntretienColl;
	}

	public void setListEntretienColl(List<Entretien> listEntretienColl) {
		this.listEntretienColl = listEntretienColl;
	}

	public List<Demande> getListDemande() {
		return listDemande;
	}

	public void setListDemande(List<Demande> listDemande) {
		this.listDemande = listDemande;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAccountNotExpired() {
		return accountNotExpired;
	}

	public void setAccountNotExpired(boolean accountNotExpired) {
		this.accountNotExpired = accountNotExpired;
	}

	public boolean isAccountNotLocked() {
		return accountNotLocked;
	}

	public void setAccountNotLocked(boolean accountNotLocked) {
		this.accountNotLocked = accountNotLocked;
	}

	public Date getLastAccessDate() {
		return lastAccessDate;
	}

	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", Adresse=");
		builder.append(Adresse);
		builder.append(", etat=");
		builder.append(etat);
		builder.append(", role=");
		builder.append(role);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
