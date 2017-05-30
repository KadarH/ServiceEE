package com.app.business.dao;

import com.app.boudaa.dao.GenericDao;
import com.app.business.bo.User;

public interface UserDao extends GenericDao<User, Long> {

	public User findByEmail(String email);
	
	
}
