package com.abm.iservice;

import com.abmware.projectplanner.data.Employee;
import com.abmware.projectplanner.data.Project;
import com.abmware.projectplanner.data.Task;

public interface IEmployeeService {

	public void updateTask(Task task);
	
	public void viewTasks(Employee employee);
	
	
	public void viewProject(Project project);
	

	
	
	
}
