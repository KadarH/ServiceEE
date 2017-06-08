package com.web.admin.decorator;

import org.displaytag.decorator.TableDecorator;

import com.app.business.bo.Objectif;

public class AdminObjectifDecorator extends TableDecorator{
	private String aj;

	public String getAj() {

		Objectif pro = (Objectif) getCurrentRowObject();
		Long id = pro.getId();

		this.aj = "<a href=\"goToEvaluationObjectifAdmin?idObjectif=" + id + "\"><img width='80' height='80' src='/ServiceEE/img/Search.jpg'></a>";

		return this.aj;
	}

}
