package com.app.business.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "idUser")
	private Long id;

	private String username;

	private String password;
	private String nom;
	private String prenom;
	private String Adresse;

	@Column(name = "email", unique = true, nullable = false, length = 100)
	private String email;
	
	@Column
    @ElementCollection(targetClass=Entretien.class,fetch = FetchType.LAZY)
	private List<Entretien> listEntretienColl;
	
	@Column
    @ElementCollection(targetClass=Entretien.class,fetch = FetchType.LAZY)
	private List<Entretien> listEntretienResp;
	
	@Column
    @ElementCollection(targetClass=RendezVous.class,fetch = FetchType.EAGER)
	private List<RendezVous> listRendezVous;

	@Column
    @ElementCollection(targetClass=RendezVous.class)
	private List<User> responsables     = new ArrayList<User>();
	
	@Column
    @ElementCollection(targetClass=RendezVous.class)
	private List<User> collaborateurs   = new ArrayList<User>();

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
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "collaborateur",cascade=CascadeType.ALL)
	public List<Entretien> getListEntretienColl() {
		return listEntretienColl;
	}

	public void setListEntretienColl(List<Entretien> listEntretien) {
		this.listEntretienColl = listEntretien;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "userdem",cascade=CascadeType.ALL)
	public List<RendezVous> getListRendezVous() {
		return listRendezVous;
	}

	public void setListRendezVous(List<RendezVous> listRendezVous) {
		this.listRendezVous = listRendezVous;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "responsable")
	public List<Entretien> getListEntretienResp() {
		return listEntretienResp;
	}

	public void setListEntretienResp(List<Entretien> listEntretienResp) {
		this.listEntretienResp = listEntretienResp;
	}

	
	@ManyToMany( cascade = CascadeType.ALL )
    @JoinTable( name = "COLLABORATEUR_RESPONSABLE",
            joinColumns = { @JoinColumn( name = "collaborateur_id" ) },
            inverseJoinColumns = { @JoinColumn( name = "responsable_id" ) } )
	public List<User> getResponsables() {
		return responsables;
	}

	public void setResponsables(List<User> responsables) {
		this.responsables = responsables;
	}

	@ManyToMany( mappedBy = "responsables",cascade=CascadeType.ALL)
	public List<User> getCollaborateurs() {
		return collaborateurs;
	}

	public void setCollaborateurs(List<User> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
	
	
}
