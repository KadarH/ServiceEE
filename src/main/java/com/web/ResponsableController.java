package com.web;

import com.opensymphony.xwork2.ActionSupport;

public class ResponsableController extends ActionSupport{
	
	private String sus;

		
	public String doWork(){
		
		sus="collaborateur";
		return SUCCESS;
	}
	
	
	public String getSus() {
		return sus;
	}

	public void setSus(String sus) {
		this.sus = sus;
	}
	
	
	

}
