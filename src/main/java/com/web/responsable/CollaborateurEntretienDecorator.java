package com.web.responsable;

import org.displaytag.decorator.TableDecorator;

import com.app.business.bo.Entretien;

public class CollaborateurEntretienDecorator extends TableDecorator{
	private String aj;

	public String getAj() {

		Entretien pro = (Entretien) getCurrentRowObject();
		Long id = pro.getId();

		this.aj = "<a href=\"goToObjectifEntretienResponsable?idEntretien=" + id + "\">Show</a>";

		return this.aj;
	}

}
