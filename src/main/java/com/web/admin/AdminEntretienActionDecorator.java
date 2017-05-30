package com.web.admin;

import org.displaytag.decorator.TableDecorator;

import com.app.business.bo.Entretien;

public class AdminEntretienActionDecorator extends TableDecorator {

	private String aj;
	private String supp;
	
	public String getSupp(){
		Entretien pro = (Entretien) getCurrentRowObject();
		Long id = pro.getId();

		this.supp = "<a href=\"goToSupprimerEntretien?idEntretien=" + id + "\"><img width='50' height='50' src='/ServiceEE/img/supp.jpeg'></a>";

		
		return this.supp;
	}
	public String getAj() {

		Entretien pro = (Entretien) getCurrentRowObject();
		Long id = pro.getId();

		this.aj = "<a href=\"goToObjectifEntretienAdmin?idEntretien=" + id + "\"><img width='50' height='50' src='/ServiceEE/img/showIcon.png'></a>";

		return this.aj;
	}

	
	

}