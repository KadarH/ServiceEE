package com.web;

import java.util.List;

import com.app.business.bo.User;
import com.app.business.service.AdminService;
import com.app.business.service.impl.AdminServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminServiceImpl();
		
		
		List<User> lista =  adminService.getListCollaborateur();
		for(User i : lista){
			System.out.println(i + "************");
		}
		
		
	}
	
	

}