package com.abmware.projectplanner.data;

public enum EmployeeType {
	ADMIN("ADMIN"),EMPLOYEE("EMPLOYEE"),PROJECTMANAGER("PROJECTMANAGER");

	String type;

	private EmployeeType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	
	
	
}
