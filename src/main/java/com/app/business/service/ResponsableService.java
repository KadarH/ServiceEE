package com.app.business.service;

import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.Objectif;
import com.app.business.bo.RendezVous;

public interface ResponsableService {

	public void ajouterEntretien(Entretien e);

	public void ajouterModifierObjectif(Objectif o)  throws EntityNotFoundException ;

	public void ajouterEvaluation(Objectif o,Evaluation e);

}
