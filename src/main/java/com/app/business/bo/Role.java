package com.app.business.bo;

import java.util.List;

public class Role {
	private Long id;
	private String label;
	private List<Permission> listPermission;

	public Role() {
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

	public List<Permission> getListPermission() {
		return listPermission;
	}

	public void setListPermission(List<Permission> listPermission) {
		this.listPermission = listPermission;
	}

}
