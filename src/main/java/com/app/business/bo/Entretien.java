package com.app.business.bo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ENTRETIEN")
public class Entretien {
	
	@Id
	@GeneratedValue
	@Column(name="idEntretien")
	private Long id;
	private String label;
	// autres
	private String etat;
	private Date dateEntretien;
	@Column
	@ElementCollection(targetClass=Objectif.class)
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
	
	@Id
	@GeneratedValue
	@Column(name="id")
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "entretien")
	public List<Objectif> getListObjectif() {
		return listObjectif;
	}

	public void setListObjectif(List<Objectif> listObjectif) {
		this.listObjectif = listObjectif;
	}
	
	@ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "collaborateur_id", nullable = false )
    public User getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(User collaborateur) {
		this.collaborateur = collaborateur;
	}

	@ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "responsable_id", nullable = false )
    public User getResponsable() {
		return responsable;
	}

	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}

	public Date getDateEntretien() {
		return dateEntretien;
	}

	public void setDateEntretien(Date dateEntretien) {
		this.dateEntretien = dateEntretien;
	}

}
