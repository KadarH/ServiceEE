package com.web.admin;

import org.displaytag.decorator.TableDecorator;

import com.app.business.bo.User;

public class AdminCollaborateurActionDecorator extends TableDecorator {

	private String supp;
	
	public String getSupp(){
		User pro = (User) getCurrentRowObject();
		Long id = pro.getId();

		this.supp = "<a href=\"goToSupprimerUser?idUser=" + id + "\"><img width='50' height='50' src='/ServiceEE/img/supp.jpeg'></a>";

		
		return this.supp;
	}
	
	

}