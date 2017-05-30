package com.app.business.service;

import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.User;

public interface AdminService {

	// *******************************************************

	public List<Demande> getListDemandeAjout();

	public void confirmerDemandeAjout(String idDemande);

	public List<Demande> getListDemandeResponsable();

	public void confirmerDemandeResponsable(String idDemande);

	// *******************************************************

	public List<Entretien> getListEntretien();

	// *******************************************************
	
	public List<User> getListCollaborateur();

	public List<User> getListResponsable();

	public void supprimerUser(Long idUser) throws EntityNotFoundException ;
	public void supprimerEntretien(Long idEntretien) throws EntityNotFoundException ;

}
