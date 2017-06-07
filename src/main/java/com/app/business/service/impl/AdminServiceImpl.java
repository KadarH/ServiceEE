package com.app.business.service.impl;

import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.Role;
import com.app.business.bo.User;
import com.app.business.dao.DemandeDao;
import com.app.business.dao.EntretienDao;
import com.app.business.dao.ObjectifDao;
import com.app.business.dao.RendezVousDao;
import com.app.business.dao.RoleDao;
import com.app.business.dao.UserDao;
import com.app.business.service.AdminService;

public class AdminServiceImpl implements AdminService {

	private DemandeDao demandeDao;
	private RendezVousDao rendezVousDao;
	private EntretienDao entretienDao;
	private ObjectifDao objectifDao;
	private UserDao userDao;
	private RoleDao roleDao;
	
//	***********************************************
	public DemandeDao getDemandeDao() {
		return demandeDao;
	}

	public void setDemandeDao(DemandeDao demandeDao) {
		this.demandeDao = demandeDao;
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

	@Override
	public List<Demande> getListDemandeAjout() {
		return demandeDao.getListDemandeAjout();
	
	}

	@Override
	public void confirmerDemandeAjout(String idDemande) throws NumberFormatException, EntityNotFoundException {
		Demande d = demandeDao.findById(new Long(idDemande));
		User u = d.getUser();
		
		u.setEtat("true");
		d.setEtat(true);
		demandeDao.update(d);
		userDao.update(u);
	}

	@Override
	public List<Demande> getListDemandeResponsable() {
		return demandeDao.getListDemandeResp();
		 
	}

	@Override
	public void confirmerDemandeResponsable(String idDemande) throws NumberFormatException, EntityNotFoundException {
		
		Demande d = demandeDao.findById(new Long(idDemande));
		User u = d.getUser();
		Role x = roleDao.findById(new Long(2));
		u.setRole(x);
		d.setEtat(true);
		demandeDao.update(d);
		userDao.update(u);
	}

	@Override
	public List<Entretien> getListEntretien() {
		return entretienDao.getAll();
	}


	@Override
	public List<User> getListCollaborateur() {
		return userDao.getEntityByColumn("User", "role_role_id", 1+"");
		
		
	}

	@Override
	public List<User> getListResponsable() {
		return userDao.getEntityByColumn("User", "role_role_id", 2+"");
		
	}

	@Override
	public void supprimerUser(Long idUser) throws EntityNotFoundException {
		userDao.delete(idUser);
	}
	
	
	public void supprimerEntretien(Long idEntretien) throws EntityNotFoundException{
		entretienDao.delete(idEntretien);
		
		
		
	}

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	

}
