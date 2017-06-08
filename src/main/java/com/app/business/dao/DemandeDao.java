package com.app.business.dao;

import java.util.List;

import com.app.business.bo.Demande;
import com.app.genericDao.dao.GenericDao;

public interface DemandeDao extends GenericDao<Demande, Long> {

	/**
	 * retourne la liste des demandes d'être membre ( demande d'inscription )
	 * 
	 * @return la liste des demandes(ajout) de la base de donnée .
	 */
	public List<Demande> getListDemandeAjout();
	
	
	/**
	 * retourne la liste des demandes d'être responsable
	 * 
	 * @return la liste des demandes(responsable) de la base de donnée .
	 */
	public List<Demande> getListDemandeResp();
	
}
