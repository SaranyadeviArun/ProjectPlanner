package com.abm.iservice;

import com.abmware.projectplanner.data.Employee;
import com.abmware.projectplanner.data.Project;
import com.abmware.projectplanner.data.Task;
import com.abmware.projectplanner.data.TaskStatus;

public interface IProjectManger {

	public void createProject(Project project);

	public void createTask(Task task);

	public void allocateTask(Employee employee);

	public void addUserToProject(Employee employee, Project project);

	public void viewTask(TaskStatus taskStatus);
}
