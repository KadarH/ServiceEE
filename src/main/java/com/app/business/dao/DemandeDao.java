package com.app.business.dao;

import java.util.List;

import com.app.boudaa.dao.GenericDao;
import com.app.business.bo.Demande;

public interface DemandeDao extends GenericDao<Demande, Long> {

	public List<Demande> getListDemandeAjout();
	public List<Demande> getListDemandeResp();
	
}
