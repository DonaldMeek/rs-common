package com.meek.donald.model.employee;

import java.io.Serializable;
import java.util.List;

public class ManagerModel implements Serializable{

	private static final long serialVersionUID = -7263076461690272314L;
	private List<String> employees;
	private int employeeCount;
	private String title;
	private double salary;
	private String teamName;
	private List<String> activeProjects;
	private boolean active;
	private Integer officeId;
	private String emplId;
	
	public String getEmplId() {
		return emplId;
	}
	public void setEmplId(String emplId) {
		this.emplId = emplId;
	}
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
