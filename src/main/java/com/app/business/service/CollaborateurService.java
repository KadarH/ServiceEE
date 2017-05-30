package com.app.business.service;

import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.Objectif;
import com.app.business.bo.RendezVous;
import com.app.business.bo.User;

public interface CollaborateurService {

	public void envoyerDemandeAjout(Demande demande);

	public void envoyerDemandeResp(Demande demande);

	public void ajouterRendezVous(RendezVous rendezVous);

	public List<Entretien> getListEntretienCollaborateur(User u);

	public List<Entretien> getListEntretienResponsable(User u);

	public List<String> getListCollaborateur();

	public List<RendezVous> getListRendezVous(User u);

	public Entretien getEntretien(Long idEntretien) throws EntityNotFoundException;

	public List<Objectif> getListObjectif(Long idEntretien) throws EntityNotFoundException;

	public Objectif getObjectif(Long idObjectif) throws EntityNotFoundException;

	public void modifierMonProfil(User user);

	public User findUserByEmail(String email);

	public void accepterRendezVous(Long id) throws EntityNotFoundException;

	public boolean findIfUserDemande(User user);

	public List<RendezVous> getListRendezVousAcceptee(User user);

}