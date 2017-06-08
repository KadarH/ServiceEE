package com.app.business.dao.impl;

import com.app.business.bo.Objectif;
import com.app.business.dao.ObjectifDao;
import com.app.genericDao.dao.impl.GenericDaoImpl;

public class ObjectifDaoImpl extends GenericDaoImpl<Objectif, Long> implements ObjectifDao {

	public ObjectifDaoImpl() {
		super(Objectif.class);
	}

	
	
}
