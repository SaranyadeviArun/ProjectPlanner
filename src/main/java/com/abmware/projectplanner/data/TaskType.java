package com.abmware.projectplanner.data;

public enum TaskType {
	
	DESIGN("DESIGN"),CODING("CODING"),TESTING("TESTING");
	
	private TaskType(String type) {
		this.type = type;
	}

	String type;

}
