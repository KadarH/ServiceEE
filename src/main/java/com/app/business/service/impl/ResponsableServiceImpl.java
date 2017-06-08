package com.app.business.service.impl;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Entretien;
import com.app.business.bo.Evaluation;
import com.app.business.bo.Objectif;
import com.app.business.dao.EntretienDao;
import com.app.business.dao.ObjectifDao;
import com.app.business.dao.RendezVousDao;
import com.app.business.dao.UserDao;
import com.app.business.service.ResponsableService;

public class ResponsableServiceImpl implements ResponsableService {

	private RendezVousDao rendezVousDao;
	private EntretienDao entretienDao;
	private ObjectifDao objectifDao;
	private UserDao userDao;
	


	@Override
	public void ajouterEntretien(Entretien e) {

		entretienDao.create(e);
		
		
	}

	@Override
	public void ajouterModifierObjectif(Objectif o) throws EntityNotFoundException {

		System.out.println("objectifDao.create");
			objectifDao.create(o);
		
		
	}

	@Override
	public void ajouterEvaluation(Objectif o,Evaluation e) {
		
		o.setEvaluation(e);
		objectifDao.update(o);
	}

	
	

	
	public RendezVousDao getRendezVousDao() {
		return rendezVousDao;
	}

	public void setRendezVousDao(RendezVousDao rendezVousDao) {
		this.rendezVousDao = rendezVousDao;
	}

	public EntretienDao getEntretienDao() {
		return entretienDao;
	}

	public void setEntretienDao(EntretienDao entretienDao) {
		this.entretienDao = entretienDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public ObjectifDao getObjectifDao() {
		return objectifDao;
	}

	public void setObjectifDao(ObjectifDao objectifDao) {
		this.objectifDao = objectifDao;
	}

	

}
