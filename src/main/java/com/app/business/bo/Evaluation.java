package com.app.business.bo;

public class Evaluation {

	private Long id;
	private String label;
	private String note;

	
	
	
	public Evaluation() {
		super();
	}

	public Evaluation(String label, String note) {
		super();
		this.label = label;
		this.note = note;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
