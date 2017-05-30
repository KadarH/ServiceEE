package com.app.business.bo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OBJECTIF")
public class Objectif {

	@Id
	@GeneratedValue
	@Column(name="idObjectif")
	private Long id;
	private String label;
	private String indicateur;
	private String delaiRealisation;
	private String conditionReussite;
	private String etat;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idEntretien")
	private Entretien entretien ;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Evaluation evaluation;

	
	public Objectif() {
		super();
	}

	public Objectif(String label, String etat) {
		super();
		this.label = label;
		this.etat = etat;
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

	
	

}
