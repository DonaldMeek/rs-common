package com.meek.donald.model.employee;

import java.util.List;

public class ManagerModel {

	List<String> employees;
	int employeeCount;
	String title;
	double salary;
	String teamName;
	List<String> activeProjects;
	boolean active;
	Integer officeId;
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Integer getOfficeId() {
		return officeId;
	}
	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}
	public List<String> getEmployees() {
		return employees;
	}
	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<String> getActiveProjects() {
		return activeProjects;
	}
	public void setActiveProjects(List<String> activeProjects) {
		this.activeProjects = activeProjects;
	}
	
	
}
