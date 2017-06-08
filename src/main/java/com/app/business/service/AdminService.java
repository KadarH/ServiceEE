package com.app.business.service;

import java.util.List;

import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.User;
import com.app.genericDao.dao.exceptions.EntityNotFoundException;

public interface AdminService {


	/**
	 * retourne la liste des demandes d'être membre ( demande d'inscription )
	 * 
	 * @return la liste des demandes(ajout) de la base de donnée .
	 */
	List<Demande> getListDemandeAjout();

	/**
	 * Confirmer la demande d'un collaborateur pour devenir un membre
	 * collaborateur
	 * 
	 * @param Id
	 *            la clé primaire de la demande
	 */
	void confirmerDemandeAjout(String idDemande) throws NumberFormatException, EntityNotFoundException;

	/**
	 * retourne la liste des demandes d'être responsable
	 * 
	 * @return la liste des demandes(responsable) de la base de donnée .
	 */
	List<Demande> getListDemandeResponsable();

	/**
	 * Confirmer la demande d'un collaborateur pour devenir un responsable
	 * 
	 * @param Id
	 *            la clé primaire de la demande
	 */
	void confirmerDemandeResponsable(String idDemande) throws NumberFormatException, EntityNotFoundException;

	/**
	 * Retourner la liste de tout les entretien.
	 * 
	 * @return A list of Interviews in database
	 */
	List<Entretien> getListEntretien();

	/**
	 * Retourner la liste de tout les collabprateur.
	 * 
	 * @return A list of users in database
	 */
	List<User> getListCollaborateur();

	/**
	 * Retourner la liste de tout les responsables.
	 * 
	 * @return A list of users in database
	 */
	List<User> getListResponsable();

	/**
	 * Supprimer un membre collaborateur.
	 * 
	 * @param l'Id
	 *            du membre
	 */
	void supprimerUser(Long idUser) throws EntityNotFoundException;

	/**
	 * Supprimer un membre responsable.
	 * 
	 * @param l'Id
	 *            du membre
	 */
	void supprimerEntretien(Long idEntretien) throws EntityNotFoundException;

}
