package com.app.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Demande;
import com.app.business.bo.Entretien;
import com.app.business.bo.Objectif;
import com.app.business.bo.RendezVous;
import com.app.business.bo.Role;
import com.app.business.bo.User;
import com.app.business.dao.DemandeDao;
import com.app.business.dao.EntretienDao;
import com.app.business.dao.ObjectifDao;
import com.app.business.dao.RendezVousDao;
import com.app.business.dao.RoleDao;
import com.app.business.dao.UserDao;
import com.app.business.service.CollaborateurService;

public class CollaborateurServiceImpl implements CollaborateurService {

	private DemandeDao demandeDao;
	private RendezVousDao rendezVousDao;
	private EntretienDao entretienDao;
	private ObjectifDao objectifDao;
	private UserDao userDao;
	private RoleDao roleDao;
	
	public void envoyerDemandeAjout(Demande demande) {
		demande.setDate(new Date().toString());
		demande.setEtat(false);
		demande.setMessage("demande d'ajout");
		demande.setType("ajout");
		demandeDao.create(demande);	
	}

	public User envoyerInscription(User user) throws EntityNotFoundException {
		
		Role x = roleDao.findById(new Long(1));
		user.setRole(x);
		user.setEtat("false");
		return userDao.create(user);
	}
	
	@Override
	public void envoyerDemandeResp(Demande demande)  {
		
		demandeDao.create(demande);
	}
	
	@Override
	public boolean findIfUserDemande(User user) {
		try{
			List<Demande> list = demandeDao.getEntityByColumn("Demande", "user_id",user.getId()+"");
			for(Demande i : list){
				if(i.getType().equals("resp") &&  i.getEtat()==false) return true;
			}
			return false;
		}
		catch(Exception e){
			
			return false;
		}

	}
	@Override
	public void ajouterRendezVous(RendezVous rendezVous) {
		rendezVousDao.create(rendezVous);
	}

	@Override
	public List<Entretien> getListEntretienCollaborateur(User u) {
		
		
		return entretienDao.getEntityByColumn("Entretien", "collaborateur_id", u.getId()+"");
		
	}

	
	public List<Entretien> getListEntretienResponsable(User u){
		return entretienDao.getEntityByColumn("Entretien", "responsable_id", u.getId()+"");
		
	}
	
	

	@Override
	public List<String> getListCollaborateur() {
		List<String> list = new ArrayList<String>();
		for(User i : userDao.getAll()){
			list.add(i.getEmail());
			
		}
			return list;
	}

	
	public List<RendezVous> getListRendezVous(User u) {
		List<RendezVous> l = new ArrayList<RendezVous>();
		l= rendezVousDao.getEntityByColumn("RendezVous", "userrec_id", u.getId()+"");
		List<RendezVous> list = new ArrayList<RendezVous>();
		
		for(RendezVous r : l){
			
			if(r.getEtat().equals("false")) list.add(r);
		}
		return list;
		
	}
	
	public List<RendezVous> getListRendezVousAcceptee(User u) {
		List<RendezVous> l = new ArrayList<RendezVous>();
		l= rendezVousDao.getEntityByColumn("RendezVous", "userdem_id", u.getId()+"");
		List<RendezVous> list = new ArrayList<RendezVous>();
		
		for(RendezVous r : l){
			
			if(r.getEtat().equals("true")) list.add(r);
		}
		return list;
		
	}
	

	

	

	@Override
	public Entretien getEntretien(Long idEntretien) throws EntityNotFoundException  {
		return entretienDao.findById(idEntretien);
		
	}

	@Override
	public List<Objectif> getListObjectif(Long idEntretien)throws EntityNotFoundException   {
		return objectifDao.getEntityByColumn("Objectif", "entretien_id", idEntretien+"");
		
	}

	@Override
	public Objectif getObjectif(Long idObjectif) throws EntityNotFoundException  {
		return objectifDao.findById(idObjectif);
	}

	@Override
	public void modifierMonProfil(User user) {
		userDao.update(user);
		
	}

	@Override
	public User findUserByEmail(String email) {
		return userDao.findByEmail(email);
		
	}

	@Override
	public void accepterRendezVous(Long id) throws EntityNotFoundException {
		RendezVous r = rendezVousDao.findById(id);
		r.setEtat("true");
		
	}
	
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

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	

}
