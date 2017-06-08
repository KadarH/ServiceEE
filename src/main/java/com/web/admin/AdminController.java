package com.web.admin;

import java.util.ArrayList;
import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.Objectif;
import com.app.business.bo.User;
import com.app.business.service.AdminService;
import com.app.business.service.CollaborateurService;
import com.web.BaseAction;

public class AdminController extends BaseAction {
	private User user = new User();

	private AdminService adminService;
	private List<Entretien> listEntretien = new ArrayList<Entretien>();
	private List<User> listCollaborateur = new ArrayList<User>();
	private List<User> listResponsable = new ArrayList<User>();
	private List<Demande> listDemandeAjout = new ArrayList<Demande>();
	private List<Demande> listDemandeResp = new ArrayList<Demande>();
	private List<Objectif> listObjectif = new ArrayList<Objectif>();
	private Evaluation evaluation = new Evaluation();
	private Objectif objectif = new Objectif();
	private CollaborateurService collaborateurService;

	// *********************************************************
	public String goToHomeAdmin() {
		user = (User) getSession().getAttribute("user");

		return SUCCESS;
	}

	public String goToAdminDemande() {
		try {
			listDemandeAjout = adminService.getListDemandeAjout();

		} catch (Exception e) {
			listDemandeAjout = new ArrayList<>();
		}
		try {
			listDemandeResp = adminService.getListDemandeResponsable();

		} catch (Exception e) {
			listDemandeResp = new ArrayList<>();
		}

		return SUCCESS;
	}

	public String accepterDemandeAjout() throws NumberFormatException, EntityNotFoundException {

		String id = getRequest().getParameter("idDemande");

		adminService.confirmerDemandeAjout(id);

		return SUCCESS;
	}

	public String accepterDemandeResp() throws NumberFormatException, EntityNotFoundException {

		String id = getRequest().getParameter("idDemande");

		adminService.confirmerDemandeResponsable(id);

		return SUCCESS;
	}

	// *********************************************************

	public String goToAdminEntretien() {

		listEntretien = adminService.getListEntretien();

		return SUCCESS;
	}

	// *********************************************************

	public String goToCollaborateurs() {
		try {
			listCollaborateur = adminService.getListCollaborateur();

		} catch (Exception e) {
			listCollaborateur = new ArrayList<>();
		}

		return SUCCESS;
	}

	// *********************************************************

	public String goToResponsables() {
		try {
			listResponsable = adminService.getListResponsable();
		} catch (Exception e) {
			listResponsable = new ArrayList<>();
		}
		return SUCCESS;
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

	public String goToSupprimerEntretien() throws NumberFormatException, EntityNotFoundException {
		user = (User) getSession().getAttribute("user");
		Long id = Long.valueOf(getRequest().getParameter("idEntretien"));
		adminService.supprimerEntretien(id);
		return SUCCESS;
	}

	public String goToSupprimerUser() throws NumberFormatException, EntityNotFoundException {
		user = (User) getSession().getAttribute("user");
		Long id = Long.valueOf(getRequest().getParameter("idUser"));
		adminService.supprimerUser(id);
		return SUCCESS;
	}

	// *********************************************************

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public List<Entretien> getListEntretien() {
		return listEntretien;
	}

	public void setListEntretien(List<Entretien> listEntretien) {
		this.listEntretien = listEntretien;
	}

	public List<User> getListCollaborateur() {
		return listCollaborateur;
	}

	public void setListCollaborateur(List<User> listCollaborateur) {
		this.listCollaborateur = listCollaborateur;
	}

	public List<User> getListResponsable() {
		return listResponsable;
	}

	public void setListResponsable(List<User> listResponsable) {
		this.listResponsable = listResponsable;
	}

	public List<Demande> getListDemandeAjout() {
		return listDemandeAjout;
	}

	public void setListDemandeAjout(List<Demande> listDemandeAjout) {
		this.listDemandeAjout = listDemandeAjout;
	}

	public List<Demande> getListDemandeResp() {
		return listDemandeResp;
	}

	public void setListDemandeResp(List<Demande> listDemandeResp) {
		this.listDemandeResp = listDemandeResp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public CollaborateurService getCollaborateurService() {
		return collaborateurService;
	}

	public void setCollaborateurService(CollaborateurService collaborateurService) {
		this.collaborateurService = collaborateurService;
	}

}
