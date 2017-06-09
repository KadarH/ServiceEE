package com.app.business.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EVALUATION")
public class Evaluation {

	@Id
	@GeneratedValue
	private Long id;
	private String label;
	private String note;
	private String cibleVisee;
	private String resultatAnnee;
	private int niveauAtteintObjectif;

	
	// *************************************************
	// **************** Constructeur ***************
	// *************************************************

	public Evaluation() {
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evaluation [id=");
		builder.append(id);
		builder.append(", label=");
		builder.append(label);
		builder.append(", note=");
		builder.append(note);
		builder.append(", cibleVisee=");
		builder.append(cibleVisee);
		builder.append(", resultatAnnee=");
		builder.append(resultatAnnee);
		builder.append(", niveauAtteintObjectif=");
		builder.append(niveauAtteintObjectif);
		builder.append("]");
		return builder.toString();
	}

}
