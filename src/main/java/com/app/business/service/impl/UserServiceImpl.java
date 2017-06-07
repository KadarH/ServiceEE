package com.app.business.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.app.boudaa.dao.exceptions.EntityNotFoundException;
import com.app.business.bo.Role;
import com.app.business.bo.User;
import com.app.business.dao.RoleDao;
import com.app.business.dao.UserDao;
import com.app.business.service.UserService;

public class UserServiceImpl implements UserService,UserDetailsService{

	private UserDao userDao;
	private RoleDao roleDao;
	protected final Log log = LogFactory.getLog(getClass());

	public UserDetails loadUserByUsername(String pLogin) throws UsernameNotFoundException {

		User user = null;
		Collection<GrantedAuthority> arrayAuths = new ArrayList<GrantedAuthority>();

		// On récupère un objet de domaine de type User ayant comme login pLogin

		try {
			user = userDao.findByEmail(pLogin);
			System.out.println("pss");
		} catch (Exception ex) {
			log.debug("Erreur d'authentification avec le login : " + pLogin);
			throw new UsernameNotFoundException("User " + pLogin + " not exists", ex);
		}

		user.setLastAccessDate(Calendar.getInstance().getTime());
		userDao.update(user);
		Role role = user.getRole();
		arrayAuths.add(new SimpleGrantedAuthority(role.getLabel()));
		// /un User (classe Spring Security) est créé
		System.out.println("oui");
		return new org.springframework.security.core.userdetails.User(pLogin, user.getPassword(), user.isEnabled(), user.isAccountNotExpired(), true,
				user.isAccountNotLocked(), arrayAuths);
	}

	public void addUser(User user) throws EntityNotFoundException {
		// pour hacher avec SHA1
		ShaPasswordEncoder encoder = new ShaPasswordEncoder();
		// Hachage du mot de passe avec un gain de sel variable = login
		String cryptedPassword = encoder.encodePassword(user.getPassword(), user.getUsername());
		// affecter le mot de passe haché
		user.setPassword(cryptedPassword);
		// stockage de l'utilisateur dans la base de données
		try {
//			if(userDao.findByEmail(user.getEmail()) != null){
//				throw new RollbackException();
//			}
			
			Role x = roleDao.findById(new Long(1));
			user.setRole(x);
			user.setEtat("false");
			userDao.create(user);
		} catch (DataIntegrityViolationException ex) {
			log.error("erreur d'ajout d'un utilisateur à cause de l'exception " + ex
					+ " . un utilisateur avec le login " + user.getUsername() + " existe déjà dans la base de données");

		}
	}

	
	public List<Role> getAllRoles(){
		return roleDao.getAllDistinct();
	}
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

}
