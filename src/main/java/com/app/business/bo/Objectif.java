package com.app.business.bo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "OBJECTIF")
public class Objectif {

	@Id
	@GeneratedValue
	private Long id;
	private String label;
	private String indicateur;
	private String delaiRealisation;
	private String conditionReussite;
	private String etat;

	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Entretien entretien;

	@OneToOne(cascade = CascadeType.ALL)
	private Evaluation evaluation;

	// *************************************************
	// **************** Constructeur ***************
	// *************************************************

	public Objectif() {
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

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Entretien getEntretien() {
		return entretien;
	}

	public void setEntretien(Entretien entretien) {
		this.entretien = entretien;
	}

	public String getIndicateur() {
		return indicateur;
	}

	public void setIndicateur(String indicateur) {
		this.indicateur = indicateur;
	}

	public String getDelaiRealisation() {
		return delaiRealisation;
	}

	public void setDelaiRealisation(String delaiRealisation) {
		this.delaiRealisation = delaiRealisation;
	}

	public String getConditionReussite() {
		return conditionReussite;
	}

	public void setConditionReussite(String conditionReussite) {
		this.conditionReussite = conditionReussite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Objectif [id=");
		builder.append(id);
		builder.append(", label=");
		builder.append(label);
		builder.append(", indicateur=");
		builder.append(indicateur);
		builder.append(", delaiRealisation=");
		builder.append(delaiRealisation);
		builder.append(", conditionReussite=");
		builder.append(conditionReussite);
		builder.append(", etat=");
		builder.append(etat);
		builder.append(", entretien=");
		builder.append(entretien);
		builder.append(", evaluation=");
		builder.append(evaluation);
		builder.append("]");
		return builder.toString();
	}

	
	
}
