package com.web.admin;

import org.displaytag.decorator.TableDecorator;

import com.app.business.bo.Demande;

public class AdminActionDecorator extends TableDecorator {

	private String aj;

	public String getAj() {

		Demande pro = (Demande) getCurrentRowObject();
		Long id = pro.getId();

		this.aj = "<a href=\"accepterDemandeAjout?idDemande=" + id
				+ "\"><img width='50' height='50' src='/ServiceEE/img/accept.png'></a>";

		return this.aj;
	}

	
	

}