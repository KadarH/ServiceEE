package com.app.business.dao.impl;

import com.app.boudaa.dao.impl.GenericDaoImpl;
import com.app.business.bo.User;
import com.app.business.dao.UserDao;

public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao{

	public UserDaoImpl() {
		super(User.class);
	}

	@Override
	public User findByEmail(String email) {
		
		return this.getEntityByColumn("User", "email", email).get(0);
		
		
	}

}
