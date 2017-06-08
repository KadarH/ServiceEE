package com.app.business.dao.impl;

import com.app.business.bo.Role;
import com.app.business.dao.RoleDao;
import com.app.genericDao.dao.impl.GenericDaoImpl;

public class RoleDaoImpl extends GenericDaoImpl<Role, Long> implements RoleDao{

	
	
	public RoleDaoImpl() {
		super(Role.class);
	}
}
