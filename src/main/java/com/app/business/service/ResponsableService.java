package com.app.business.service;

import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.Objectif;
import com.app.genericDao.dao.exceptions.EntityNotFoundException;

public interface ResponsableService {

	/**
	 * @author kadar
	 * Cette methode permet d'ajouter un entretien 
	 * @param un Entretien de type Entretien
	 */
	public void ajouterEntretien(Entretien e);

	/**
	 * @author kadar
	 * Cette methode permet d'ajouter ou modifier un objectif  
	 * @param un objectif de type Objectif
	 */
	public void ajouterModifierObjectif(Objectif o)  throws EntityNotFoundException ;

	/**
	 * @author kadar
	 * Cette methode permet d'ajouter une evaluation 
	 * @param un objectif de type Objectif
	 * @param une evaluation
	 */
	public void ajouterEvaluation(Objectif o,Evaluation e);
}
