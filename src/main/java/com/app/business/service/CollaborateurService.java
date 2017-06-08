package com.app.business.service;

import java.util.List;

import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.Objectif;
import com.app.business.bo.RendezVous;
import com.app.business.bo.User;
import com.app.genericDao.dao.exceptions.EntityNotFoundException;

public interface CollaborateurService {
	
	/**
	 * @author kadar
	 * Envoyer une demande d'ajout 
	 * @param un objet de type Demande
	 */
	public void envoyerDemandeAjout(Demande demande);
	/**
	 * Envoyer une inscription 
	 * @param un objet de type user qui sera ajouter à la base de donnée
	 */
	public User envoyerInscription(User user) throws EntityNotFoundException ;
	/**
	 * Envoyer une demande pour devenir un responsable 
	 * @param un objet de type Demande
	 */
	public void envoyerDemandeResp(Demande demande);
	/**
	 * cetter methode ajoute un rendez vous 
	 * @param l'objet rendez vous contient plusieur information , 
	 * parmi lesquelles on trouve le destinataire et l'emmeteur du rendez vous 
	 */
	public void ajouterRendezVous(RendezVous rendezVous);

	
	/**
	 * retourne la liste des entretien 
	 * @param le membre connecté
	 * @return la liste des entretien concernant le user entré en parametres.
	 */
	public List<Entretien> getListEntretienCollaborateur(User u);

	
	/**
	 * retourne la liste des entretien dont le user entré en parametres est responsable.
	 * @param le membre connecté
	 * @return la liste des entretien dont le user entré en parametres est responsable.
	 */
	public List<Entretien> getListEntretienResponsable(User u);

	/**
	 * retourne la liste des entretien dont le user entré en parametres est responsable.
	 * @return la liste des collaborateur
	 */
	public List<String> getListCollaborateur();

	/**
	 * retourne la liste des RendezVous dont le user entré en parametres est responsable.
	 * @return la liste des rendezVous
	 */
	public List<RendezVous> getListRendezVous(User u);
	/**
	 * retourne l'entretien demandé en admettant comme parametre son id
	 * @param id de l'entretien
	 * @return l'entretien dont l'id = le paramétre
	 */
	
	public Entretien getEntretien(Long idEntretien) throws EntityNotFoundException;
	/**
	 * retourne la liste des objectif dont l'id entré en parametres concerne un entretien.
	 * @param l'id de l'entretien selectionné
	 * @return la liste des objectif
	 */
	public List<Objectif> getListObjectif(Long idEntretien) throws EntityNotFoundException;
	/**
	 * retourne l'objectif dont l'id entré en parametres concerne un objectif.
	 * @param l'id de l'objectif selectionné
	 * @return l'objet objectif
	 */
	public Objectif getObjectif(Long idObjectif) throws EntityNotFoundException;

	public void modifierMonProfil(User user);

	public User findUserByEmail(String email);

	/**
	 * Cette methode permet d'accepter un rendez Vous
	 * @param id du rendezVous
	 */
	public void accepterRendezVous(Long id) throws EntityNotFoundException;

	/**
	 * Cette methode verifie si l'utilisateur a dejà envoyer une demande d'etre responsable
	 * @return true si oui
	 * false si non
	 */
	public boolean findIfUserDemande(User user);

	/**
	 * retourne la liste des entretien dont le user entré en parametres est responsable.
	 * @param le membre connécté
	 * @return la liste des rendez vous acceptés
	 */
	public List<RendezVous> getListRendezVousAcceptee(User user);
	
	
}