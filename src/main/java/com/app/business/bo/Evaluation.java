package com.app.business.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EVALUATION")
public class Evaluation {

	@Id
	@GeneratedValue
	@Column(name="idEvaluation")
	private Long id;
	private String label;
	private String note;
	private String cibleVisee;
	private String resultatAnnee;
	private int niveauAtteintObjectif;
	
	
	
	public Evaluation() {
		super();
	}

	public Evaluation(String label, String note) {
		super();
		this.label = label;
		this.note = note;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCibleVisee() {
		return cibleVisee;
	}

	public void setCibleVisee(String cibleVisée) {
		this.cibleVisee = cibleVisée;
	}

	public String getResultatAnnee() {
		return resultatAnnee;
	}

	public void setResultatAnnee(String resultatAnnee) {
		this.resultatAnnee = resultatAnnee;
	}

	public int getNiveauAtteintObjectif() {
		return niveauAtteintObjectif;
	}

	public void setNiveauAtteintObjectif(int niveauAtteintObjectif) {
		this.niveauAtteintObjectif = niveauAtteintObjectif;
	}
	
	

}
