package com.app.business.dao.impl;

import com.app.business.bo.User;
import com.app.business.dao.UserDao;
import com.app.genericDao.dao.impl.GenericDaoImpl;

public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao{

	public UserDaoImpl() {
		super(User.class);
	}

	@Override
	public User findByEmail(String email) {
		
		try {
			return this.getEntityByColumn("User", "email", email).get(0);
			
		} catch (Exception e) {
			return null;
		}
		
		
	}
}
