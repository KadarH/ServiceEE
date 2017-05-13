package com.app.business.service;

import java.util.List;

import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.User;

public interface AdminService {

	// *******************************************************

	public List<Demande> getListDemandeAjout();

	public void confirmerDemandeAjout(Long idCollaborateur);

	public List<Demande> getListDemandeResponsable();

	public void confirmerDemandeResponsable(Long idResponsable);

	// *******************************************************

	public List<Entretien> getListEntretien();

	public List<Evaluation> getListEvaluation();

	// *******************************************************

	public List<User> getListCollaborateur();

	public List<User> getListResponsable();

	public void supprimerUser(Long idUser);

}
