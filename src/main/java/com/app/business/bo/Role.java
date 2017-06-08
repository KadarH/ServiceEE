package com.app.business.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role {

	@Id
	@GeneratedValue
	private Long id;

	private String label;

	// *************************************************
	// **************** Constructeur ***************
	// *************************************************

	public Role() {
		super();
	}

	// *************************************************
	// **************** Getters And Setters ***************
	// *************************************************

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Role [id=");
		builder.append(id);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}

	
}
