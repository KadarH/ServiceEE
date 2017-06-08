package com.app.business.bo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "ENTRETIEN")
public class Entretien {

	@Id
	@GeneratedValue
	private Long id;
	private String label;
	// autres
	private String etat;
	private String dateEntretien;

	@Column
	@ElementCollection(targetClass = Objectif.class)
	private List<Objectif> listObjectif;

	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	private User collaborateur;

	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	private User responsable;

	// *************************************************
	// **************** Constructeur ***************
	// *************************************************

	public Entretien() {
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

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "entretien")
	public List<Objectif> getListObjectif() {
		return listObjectif;
	}

	public void setListObjectif(List<Objectif> listObjectif) {
		this.listObjectif = listObjectif;
	}

	@ManyToOne
	public User getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(User collaborateur) {
		this.collaborateur = collaborateur;
	}

	@ManyToOne
	public User getResponsable() {
		return responsable;
	}

	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}

	public String getDateEntretien() {
		return dateEntretien;
	}

	public void setDateEntretien(String dateEntretien) {
		this.dateEntretien = dateEntretien;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Entretien [id=");
		builder.append(id);
		builder.append(", label=");
		builder.append(label);
		builder.append(", etat=");
		builder.append(etat);
		builder.append(", dateEntretien=");
		builder.append(dateEntretien);
		builder.append(", collaborateur=");
		builder.append(collaborateur);
		builder.append(", responsable=");
		builder.append(responsable);
		builder.append("]");
		return builder.toString();
	}
	
	

}
