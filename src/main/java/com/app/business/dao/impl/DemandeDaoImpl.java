package com.app.business.dao.impl;

import java.util.ArrayList;
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

		List<Demande> list = this.getEntityByColumn("Demande", "type","ajout");
		List<Demande> listaa = new ArrayList<Demande>();
		for(Demande i :list){
			if(i.getEtat()==false){
				listaa.add(i);
			}
			else continue;
		}
		return listaa;
	}

	@Override
	public List<Demande> getListDemandeResp() {
		List<Demande> list = this.getEntityByColumn("Demande", "type","resp");
		List<Demande> listaa = new ArrayList<Demande>();
		for(Demande i :list){
			if(i.getEtat()==false){
				listaa.add(i);
			}
		}
		return listaa;
	}

}
