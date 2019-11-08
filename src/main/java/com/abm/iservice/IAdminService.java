package com.abm.iservice;

import java.util.List;

import com.abmware.projectplanner.data.Employee;
import com.abmware.projectplanner.data.EmployeeType;
import com.abmware.projectplanner.data.SearchParam;

public interface IAdminService {

	public void createEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void assignRoles(Employee employee, EmployeeType employeeType);

	public void deleteEmployee(Employee employee);

	//public void editRoles();

	public void viewEmployees();
	
	public List<Employee> searchEmployees(SearchParam searchParam);
	
	public void viewRoles();
}
