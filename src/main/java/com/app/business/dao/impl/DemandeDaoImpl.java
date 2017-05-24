package com.app.business.dao.impl;

import java.util.List;

import com.app.boudaa.dao.impl.GenericDaoImpl;
import com.app.business.bo.Demande;
import com.app.business.dao.DemandeDao;

public class DemandeDaoImpl extends GenericDaoImpl<Demande, Long> implements DemandeDao{

	
	public DemandeDaoImpl() {
		super(Demande.class);
	}

	
	@Override
	public List<Demande> getListDemandeAjout() {
		
		return null;
	}

	@Override
	public List<Demande> getListDemandeResp() {
		return null;
	}

}
