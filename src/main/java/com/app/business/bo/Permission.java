package com.app.business.bo;

import java.util.List;

public class Permission {

	private Long id;
	private String label;
	private List<Role> listRole;
	public Permission(String label) {
		super();
		this.label = label;
	}

	public Permission() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Role> getListRole() {
		return listRole;
	}

	public void setListRole(List<Role> listRole) {
		this.listRole = listRole;
	}

}
