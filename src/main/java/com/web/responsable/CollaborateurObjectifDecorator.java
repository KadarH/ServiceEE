package com.web.responsable;

import org.displaytag.decorator.TableDecorator;

import com.app.business.bo.Objectif;
import com.app.business.bo.RendezVous;

public class CollaborateurObjectifDecorator extends TableDecorator{
	private String aj;

	public String getAj() {

		Objectif pro = (Objectif) getCurrentRowObject();
		Long id = pro.getId();

		this.aj = "<a href=\"goToEvaluationObjectifResponsable?idObjectif=" + id + "\">Show Evaluation</a>";

		return this.aj;
	}

}
