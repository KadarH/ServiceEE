package com.web.responsable;

import java.util.ArrayList;
import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.Objectif;
import com.app.business.bo.RendezVous;
import com.app.business.bo.User;
import com.app.business.service.CollaborateurService;
import com.app.business.service.ResponsableService;
import com.web.BaseAction;

public class ResponsableController extends BaseAction {

	User user = new User();
	private CollaborateurService collaborateurService;
	private ResponsableService responsableService;
	private RendezVous rendezVous = new RendezVous();
	private List<Entretien> listEntretienCollaborateur = new ArrayList<Entretien>();
	private List<Entretien> listEntretienResponsable = new ArrayList<Entretien>();
	private List<RendezVous> listRendezVous = new ArrayList<RendezVous>();
	private List<RendezVous> listRendezVousAcceptee = new ArrayList<RendezVous>();
	private List<String> listCollaborateur = new ArrayList<String>();
	private List<Objectif> listObjectif = new ArrayList<Objectif>();
	private Evaluation evaluation = new Evaluation();
	private Entretien entretien = new Entretien();
	private Objectif objectif = new Objectif();
	private String ancienPass;
	private String newPass;
	private String pass;
	private String x;

	public String goToResponsableHome() {

		user = (User) getSession().getAttribute("user");

		return SUCCESS;
	}

	public String goToEntretien() {
		user = (User) getSession().getAttribute("user");
		try {
			listCollaborateur = collaborateurService.getListCollaborateur();
			listEntretienResponsable = collaborateurService.getListEntretienResponsable(user);
			listEntretienCollaborateur = collaborateurService.getListEntretienCollaborateur(user);
			return SUCCESS;
		} catch (Exception e) {
			return SUCCESS;
		}
	}

	public Entretien getEntretien() {
		return entretien;
	}

	public void setEntretien(Entretien entretien) {
		this.entretien = entretien;
	}

	public String goToObjectifEntretien() throws NumberFormatException, EntityNotFoundException {
		user = (User) getSession().getAttribute("user");
		String id = getRequest().getParameter("idEntretien");

		listObjectif = collaborateurService.getListObjectif(new Long(Integer.parseInt(id)));

		return SUCCESS;
	}

	public String goToEvaluationObjectif() throws NumberFormatException, EntityNotFoundException {
		user = (User) getSession().getAttribute("user");
		String id = getRequest().getParameter("idObjectif");

		objectif = collaborateurService.getObjectif(new Long(Integer.parseInt(id)));

		evaluation = objectif.getEvaluation();

		return SUCCESS;
	}

	public String goToRendezVous() {
		user = (User) getSession().getAttribute("user");
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

	public String ajouterRendezVous() {
		user = (User) getSession().getAttribute("user");
		System.out.println(user + "*********" + user.getEmail());

		User y = (User) collaborateurService.findUserByEmail(x);
		System.out.println(y.getEmail());
		rendezVous.setUserdem(user);
		rendezVous.setUserrec(y);
		rendezVous.setEtat("false");
		collaborateurService.ajouterRendezVous(rendezVous);
		return SUCCESS;
	}

	public String ajouterEntretien() {
		user = (User) getSession().getAttribute("user");

		User y = (User) collaborateurService.findUserByEmail(x);
		entretien.setCollaborateur(y);
		entretien.setEtat("En cours");
		entretien.setResponsable(user);
		responsableService.ajouterEntretien(entretien);
		getSession().setAttribute("entretien", entretien);
		return SUCCESS;
	}

	public String ajouterObjectifEntretien() throws EntityNotFoundException {

		user = (User) getSession().getAttribute("user");
		entretien = (Entretien) getSession().getAttribute("entretien");

		objectif.setEntretien(entretien);
		objectif.setEtat("En cours");
		responsableService.ajouterModifierObjectif(objectif);
		return SUCCESS;

	}

	public String goToProfil() {
		user = (User) getSession().getAttribute("user");
		return SUCCESS;
	}

	public String modifierProfil() {
		user = (User) getSession().getAttribute("user");

		collaborateurService.modifierMonProfil(user);
		getSession().setAttribute("user", user);
		System.out.println(user);
		return SUCCESS;

	}

	public String goToAjouterObjectif() {

		return SUCCESS;
	}
	// *****************************************************************
	//
	// *****************************************************************

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CollaborateurService getCollaborateurService() {
		return collaborateurService;
	}

	public void setCollaborateurService(CollaborateurService collaborateurService) {
		this.collaborateurService = collaborateurService;
	}

	public ResponsableService getResponsableService() {
		return responsableService;
	}

	public void setResponsableService(ResponsableService responsableService) {
		this.responsableService = responsableService;
	}

	public RendezVous getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	}

	public List<Entretien> getListEntretienCollaborateur() {
		return listEntretienCollaborateur;
	}

	public void setListEntretienCollaborateur(List<Entretien> listEntretienCollaborateur) {
		this.listEntretienCollaborateur = listEntretienCollaborateur;
	}

	public List<Entretien> getListEntretienResponsable() {
		return listEntretienResponsable;
	}

	public void setListEntretienResponsable(List<Entretien> listEntretienResponsable) {
		this.listEntretienResponsable = listEntretienResponsable;
	}

	public List<RendezVous> getListRendezVous() {
		return listRendezVous;
	}

	public void setListRendezVous(List<RendezVous> listRendezVous) {
		this.listRendezVous = listRendezVous;
	}

	public List<RendezVous> getListRendezVousAcceptee() {
		return listRendezVousAcceptee;
	}

	public void setListRendezVousAcceptee(List<RendezVous> listRendezVousAcceptee) {
		this.listRendezVousAcceptee = listRendezVousAcceptee;
	}

	public List<String> getListCollaborateur() {
		return listCollaborateur;
	}

	public void setListCollaborateur(List<String> listCollaborateur) {
		this.listCollaborateur = listCollaborateur;
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

}
