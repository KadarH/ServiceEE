package com.app.business.bo;

import java.util.List;

public class Objectif {

	private Long id;
	private String label;
	private String etat;

	private List<Evaluation> listEvaluation;

	
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

	public List<Evaluation> getListEvaluation() {
		return listEvaluation;
	}

	public void setListEvaluation(List<Evaluation> listEvaluation) {
		this.listEvaluation = listEvaluation;
	}

}
