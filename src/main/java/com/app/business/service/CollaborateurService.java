package com.app.business.service;

import java.util.List;

import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.Objectif;
import com.app.business.bo.User;

public interface CollaborateurService {

	public void envoyerDemandeAjout(Demande demande);

	public void envoyerDemandeResp(Demande demande);

	public List<Entretien> getListEntretien(User u);

	public Entretien getEntretien(Long idEntretien);

	public List<Objectif> getListObjectif(Long idEntretien);

	public Objectif getObjectif(Long idObjectif);

	
	
}