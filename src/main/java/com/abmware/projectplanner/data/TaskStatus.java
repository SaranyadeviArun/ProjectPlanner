package com.abmware.projectplanner.data;

public enum TaskStatus {
	
	COMPLETED("COMPLETED"),INPROGRESS("INPROGRESS"),PENDTING("PENDING"),VOID("VOID");
	
	String type;

	private TaskStatus(String type) {
		this.type = type;
	}

}
