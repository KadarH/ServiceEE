package com.web;

import java.util.ArrayList;
import java.util.List;

import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.User;
import com.app.business.service.CollaborateurService;
import com.opensymphony.xwork2.ActionSupport;

public class CollaborateurController extends ActionSupport{
	
	private CollaborateurService collaborateurService;
	private User user ;
	private Demande demande;
	private List<Entretien> listEntretien = new ArrayList<Entretien>();
	
	
	public String doWork(){
		
		
		return SUCCESS;
	}
	
	
	public String AjouterDemandeAjout(){
		demande.setMessage("demande d'ajout");
		demande.setUser(user);
		demande.setType("ajout");
		demande.setEtat(false);
		collaborateurService.envoyerDemandeAjout(demande);
		
		return SUCCESS;
	}
	public String AjouterDemandeResp(){
		demande.setMessage("demande d'etre responsable");
		demande.setUser(user);
		demande.setType("resp");
		demande.setEtat(false);
		collaborateurService.envoyerDemandeResp(demande);
		
		return SUCCESS;
	}
	 
	public String listEntretien(){
		
		listEntretien= collaborateurService.getListEntretien(user);
		
		
		return SUCCESS;
	}
	
	
	

}
