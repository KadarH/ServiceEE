package com.web.responsable;

import org.displaytag.decorator.TableDecorator;

import com.app.business.bo.RendezVous;

public class CollaborateurActionDecorator extends TableDecorator {

	private String aj;

	public String getAj() {

		RendezVous pro = (RendezVous) getCurrentRowObject();
		Long id = pro.getId();

		this.aj = "<a href=\"accepterRendezVousResponsable?idRendezVous=" + id
				+ "\"><img width='50' height='50' src='/ServiceEE/img/accept.png'></a>";

		return this.aj;
	}

	
	

}