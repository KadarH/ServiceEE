package com.app.business.dao.impl;

import java.util.List;

import com.app.boudaa.dao.impl.GenericDaoImpl;
import com.app.business.bo.RendezVous;
import com.app.business.dao.RendezVousDao;

public class RendezVousDaoImpl extends GenericDaoImpl<RendezVous, Long> implements RendezVousDao {

	public RendezVousDaoImpl() {
		super(RendezVous.class);
	}


}
