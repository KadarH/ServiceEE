package com.app.business.dao.impl;

import com.app.boudaa.dao.impl.GenericDaoImpl;
import com.app.business.bo.Entretien;
import com.app.business.dao.EntretienDao;

public class EntretienDaoImpl  extends GenericDaoImpl<Entretien, Long> implements EntretienDao{

	public EntretienDaoImpl() {
		super(Entretien.class);
		// TODO Auto-generated constructor stub
	}
	

}
