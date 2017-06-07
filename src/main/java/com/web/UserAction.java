package com.web;

import java.util.Date;
import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Demande;
import com.app.business.bo.Role;
import com.app.business.bo.User;
import com.app.business.service.CollaborateurService;
import com.app.business.service.UserService;

public class UserAction extends BaseAction {

	private User user = new User();
	private List<Role> listRoles;
	private UserService userService;
	private CollaborateurService collaborateurService;
	
	
	
	public String goToHome() {

//		Collection ath = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
//		user = collaborateurService.findUserByEmail(user.getEmail());
//		getSession().setAttribute("user", user);
//		listRoles = userService.getAllRoles();
//
//		if (ath.contains(new SimpleGrantedAuthority("Collaborateur"))) {
//			
//			if(user.getEtat().equals("false"))return "errorCollaborateur1";
//			
//			
//			return "successCollaborateur";
//
//		}
//
//		else if (ath.contains(new SimpleGrantedAuthority("Admin"))) {
//
//			return "successAdmin";
//
//		}
//		else if (ath.contains(new SimpleGrantedAuthority("Responsable"))) {
//
//			return "successResponsable";
//
//		}
		
		try {
			user = collaborateurService.findUserByEmail(user.getEmail());
			getSession().setAttribute("user", user);
			if(user.getRole().getId() == 1){
				if(user.getEtat().equals("false"))return "errorCollaborateur1";
				return "successCollaborateur";
			}
			if(user.getRole().getId() == 2){
				return "successResponsable";

			}
			if(user.getRole().getId() == 3){
				return "successAdmin";
			}
			return "problem";
		} catch (Exception e) {

			return ERROR;
		}

	}

	public String denied() {
		return SUCCESS;

	}
	public String addCollaborateur() throws EntityNotFoundException {
		try {

			Demande demande = new Demande();
			demande.setDate(new Date().toString());
			demande.setEtat(false);
			demande.setMessage("demande d'ajout");
			demande.setType("ajout");

			User u = collaborateurService.envoyerInscription(user);
			demande.setUser(u);
			collaborateurService.envoyerDemandeAjout(demande);

			userService.addUser(user);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public CollaborateurService getCollaborateurService() {
		return collaborateurService;
	}

	public void setCollaborateurService(CollaborateurService collaborateurService) {
		this.collaborateurService = collaborateurService;
	}

}
