package com.app.business.dao.impl;

import com.app.business.bo.Entretien;
import com.app.business.dao.EntretienDao;
import com.app.genericDao.dao.impl.GenericDaoImpl;

public class EntretienDaoImpl  extends GenericDaoImpl<Entretien, Long> implements EntretienDao{

	public EntretienDaoImpl() {
		super(Entretien.class);
		// TODO Auto-generated constructor stub
	}
	

}
