package com.web.collaborateur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.Objectif;
import com.app.business.bo.RendezVous;
import com.app.business.bo.User;
import com.app.business.service.CollaborateurService;
import com.web.BaseAction;

public class CollaborateurController extends BaseAction {

	protected final Logger TRACER = Logger.getLogger(getClass());
	private CollaborateurService collaborateurService;
	private User user = new User();
	private Demande demande = new Demande();
	private RendezVous rendezVous = new RendezVous();
	private List<Entretien> listEntretien = new ArrayList<Entretien>();
	private List<RendezVous> listRendezVous = new ArrayList<RendezVous>();
	private List<RendezVous> listRendezVousAcceptee = new ArrayList<RendezVous>();
	private List<String> listCollaborateur = new ArrayList<String>();
	private List<Objectif> listObjectif = new ArrayList<Objectif>();
	private Evaluation evaluation = new Evaluation();
	private Objectif objectif = new Objectif();
	private String ancienPass;
	private String newPass;
	private String pass;
	private String x;

	// ************************************************************************************

	public CollaborateurController() {
		TRACER.debug("collaborateur action instancié");
	}

	public String logout() {
		getSession().invalidate();

		return SUCCESS;
	}

	// ************************************************************************************
	public String goToHome() {
		try {
			user = collaborateurService.findUserByEmail(user.getEmail());
			getSession().setAttribute("user", user);
			if (user.getRole().getId() == 1) {
				if (user.getEtat().equals("false"))
					return "errorCollaborateur1";
				return "successCollaborateur";
			}
			if (user.getRole().getId() == 2) {
				return "successResponsable";

			}
			if (user.getRole().getId() == 3) {
				return "successAdmin";
			}
			return "problem";
		} catch (Exception e) {

			return ERROR;
		}

	}

	public String addCollaborateur() throws EntityNotFoundException {
		Demande demande = new Demande();
		demande.setDate(new Date().toString());
		demande.setEtat(false);
		demande.setMessage("demande d'ajout");
		demande.setType("ajout");

		User u = collaborateurService.envoyerInscription(user);
		demande.setUser(u);
		collaborateurService.envoyerDemandeAjout(demande);
		return SUCCESS;
	}

	public String goToHomeCollaborateur() {
		user = (User) getSession().getAttribute("user");
		return SUCCESS;

	}

	public String goToDemande() {
		user = (User) getSession().getAttribute("user");

		if (collaborateurService.findIfUserDemande(user)) {
			return INPUT;
		}

		return SUCCESS;
	}

	public String goToRendezVous() {
		user = (User) getSession().getAttribute("user");
		TRACER.debug("Methode goToHome appelée");
		System.out.println(user.getId() + "**********" + user.getEmail());

		try {
			listCollaborateur = collaborateurService.getListCollaborateur();

		} catch (Exception e) {
			listCollaborateur = new ArrayList<String>();
		}

		try {
			listRendezVous = collaborateurService.getListRendezVous(user);

		} catch (Exception e) {
			listRendezVous = new ArrayList<RendezVous>();
		}
		try {
			listRendezVousAcceptee = collaborateurService.getListRendezVousAcceptee(user);

		} catch (Exception e) {
			listRendezVousAcceptee = new ArrayList<RendezVous>();
		}
		return SUCCESS;
	}

	public String accepterRendezVous() throws NumberFormatException, EntityNotFoundException {
		String id = getRequest().getParameter("idRendezVous");
		collaborateurService.accepterRendezVous(new Long(Integer.parseInt(id)));
		return SUCCESS;
	}

	public String goToEntretien() {
		user = (User) getSession().getAttribute("user");

		try {
			listEntretien = collaborateurService.getListEntretienCollaborateur(user);
			return SUCCESS;
		} catch (Exception e) {
			return SUCCESS;
		}

	}

	public String goToObjectifEntretien() throws NumberFormatException, EntityNotFoundException {
		user = (User) getSession().getAttribute("user");
		String id = getRequest().getParameter("idEntretien");
		Long x = new Long(Integer.parseInt(id));
		listObjectif = collaborateurService.getListObjectif(x);
		System.out.println(x);
		return SUCCESS;
	}

	public String goToEvaluationObjectif() throws NumberFormatException, EntityNotFoundException {
		user = (User) getSession().getAttribute("user");
		String id = getRequest().getParameter("idObjectif");

		objectif = collaborateurService.getObjectif(new Long(Integer.parseInt(id)));

		evaluation = objectif.getEvaluation();

		return SUCCESS;
	}

	public String ajouterDemandeResp() throws EntityNotFoundException {

		user = (User) getSession().getAttribute("user");
		demande.setMessage("demande d'etre responsable");
		demande.setUser(user);
		demande.setType("resp");
		demande.setEtat(false);
		demande.setDate(new Date().toString());
		collaborateurService.envoyerDemandeResp(demande);
		return SUCCESS;
	}

	public String ajouterRendezVous() {
		user = (User) getSession().getAttribute("user");

		User y = (User) collaborateurService.findUserByEmail(x);
		System.out.println(y.getEmail());
		rendezVous.setUserdem(user);
		rendezVous.setUserrec(y);
		rendezVous.setEtat("false");
		collaborateurService.ajouterRendezVous(rendezVous);
		return SUCCESS;
	}

	public String goToProfil() {
		user = (User) getSession().getAttribute("user");
		return SUCCESS;
	}

	public String modifierProfil() {
		User y = (User) getSession().getAttribute("user");
		y.setNom(user.getNom());
		y.setPrenom(user.getPrenom());
		y.setAdresse(user.getAdresse());
		y.setUsername(user.getUsername());
		y.setPassword(user.getPassword());

		collaborateurService.modifierMonProfil(y);
		return SUCCESS;

	}

	public String modifierPass() {
		user = (User) getSession().getAttribute("user");

		if (user.getPassword().equals(ancienPass)) {
			if (pass.equals(newPass)) {
				collaborateurService.modifierMonProfil(user);
				return SUCCESS;
			}
		}
		return ERROR;
	}

	public String register() {
		demande.setMessage("demande d'ajout");
		demande.setUser(user);
		demande.setType("ajout");
		demande.setEtat(false);
		collaborateurService.envoyerDemandeAjout(demande);
		return SUCCESS;
	}

	// *********************************************************************************
	// Getters and Setters
	// *********************************************************************************

	public CollaborateurService getCollaborateurService() {
		return collaborateurService;
	}

	public void setCollaborateurService(CollaborateurService collaborateurService) {
		this.collaborateurService = collaborateurService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	public List<Entretien> getListEntretien() {
		return listEntretien;
	}

	public void setListEntretien(List<Entretien> listEntretien) {
		this.listEntretien = listEntretien;
	}

	public List<RendezVous> getListRendezVous() {
		return listRendezVous;
	}

	public void setListRendezVous(List<RendezVous> listRendezVous) {
		this.listRendezVous = listRendezVous;
	}

	public List<String> getListCollaborateur() {
		return listCollaborateur;
	}

	public void setListCollaborateur(List<String> listCollaborateur) {
		this.listCollaborateur = listCollaborateur;
	}

	public RendezVous getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	}

	public String getAncienPass() {
		return ancienPass;
	}

	public void setAncienPass(String ancienPass) {
		this.ancienPass = ancienPass;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public List<Objectif> getListObjectif() {
		return listObjectif;
	}

	public void setListObjectif(List<Objectif> listObjectif) {
		this.listObjectif = listObjectif;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Objectif getObjectif() {
		return objectif;
	}

	public void setObjectif(Objectif objectif) {
		this.objectif = objectif;
	}

	public Logger getTRACER() {
		return TRACER;
	}

	public List<RendezVous> getListRendezVousAcceptee() {
		return listRendezVousAcceptee;
	}

	public void setListRendezVousAcceptee(List<RendezVous> listRendezVousAcceptee) {
		this.listRendezVousAcceptee = listRendezVousAcceptee;
	}

}
