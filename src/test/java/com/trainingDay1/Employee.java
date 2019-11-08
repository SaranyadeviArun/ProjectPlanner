package com.trainingDay1;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	
	
	 String name; 
	 String email;
	 String address;
	 String mobileNo;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	 
	
	public static void main(String args[]) {
		Employee emp1 = new Employee();
		emp1.setEmail("raviteja@gmail");
		
		
		
		Employee emp2 = new Employee();
		
		
		emp2.setEmail("mumbi@gmail");
		
		
		
		Employee emp3 = new Employee();
		
		emp3.setEmail("raviteja@gmail");
		
		Set<Employee> emps = new HashSet<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		System.out.println(emps);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
	
		
		
		
	}

	


