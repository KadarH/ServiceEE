package com.app.business.dao.impl;

import com.app.boudaa.dao.impl.GenericDaoImpl;
import com.app.business.bo.Objectif;
import com.app.business.dao.ObjectifDao;

public class ObjectifDaoImpl extends GenericDaoImpl<Objectif, Long> implements ObjectifDao {

	public ObjectifDaoImpl() {
		super(Objectif.class);
	}

	
	
}
