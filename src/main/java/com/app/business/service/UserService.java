package com.app.business.service;

import java.util.List;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Role;
import com.app.business.bo.User;

public interface UserService {

	public void addUser(User user) throws EntityNotFoundException ;
		
	public List<Role> getAllRoles();
	
}
