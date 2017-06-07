package com.app.business.dao.impl;

import com.app.boudaa.dao.impl.GenericDaoImpl;
import com.app.business.bo.Role;
import com.app.business.dao.RoleDao;

public class RoleDaoImpl extends GenericDaoImpl<Role, Long> implements RoleDao{

	
	
	public RoleDaoImpl() {
		super(Role.class);
	}
}
