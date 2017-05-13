package com.app.business.service;

import java.util.List;

import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.Objectif;
import com.app.business.bo.RendezVous;

public interface ResponsableService {

	public void ajouterEntretien(Entretien e);

	public void ajouterModifierObjectif(Objectif o);

	public void ajouterRendezVous(RendezVous r);

	public void AnnulerRendezVous(RendezVous r);

	public void ajouterEvaluation(Evaluation e);

	public List<Entretien> listEntretiensColl();

	public List<Entretien> listEntretiensResp();

	public List<Objectif> listObjectifEntretien(Long idEntretien);

	public List<Evaluation> listEvaluationObjectif(Long idObjectif);

}
