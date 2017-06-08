package com.app.business.dao.impl;

import com.app.business.bo.RendezVous;
import com.app.business.dao.RendezVousDao;
import com.app.genericDao.dao.impl.GenericDaoImpl;

public class RendezVousDaoImpl extends GenericDaoImpl<RendezVous, Long> implements RendezVousDao {

	public RendezVousDaoImpl() {
		super(RendezVous.class);
	}


}
