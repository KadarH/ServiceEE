package com.app.business.dao;

import com.app.business.bo.User;
import com.app.genericDao.dao.GenericDao;

public interface UserDao extends GenericDao<User, Long> {

	/**
	 * retourne l'objet user avec l'email entré en paramètre des demandes d'être
	 * responsable
	 * 
	 * @param l'email
	 *            de l'objet demandé
	 * @return user with email ' email '
	 */
	public User findByEmail(String email);

}
