package com.meek.donald.model.projects;

import java.util.List;

public class ProjectModel {

	private String projectType;
	private double projectBudget;
	private int emplCount;
	private String startDate;
	private String endDate;
	private Integer projectManagerEmplId;
	private Integer techLeadEmplId;
	private String description;
	private String projectName;
	private Integer projectId;
	private List<Integer> projectEmplIds;
	private boolean active;
	
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public List<Integer> getProjectEmplIds() {
		return projectEmplIds;
	}
	public void setProjectEmplIds(List<Integer> projectEmplIds) {
		this.projectEmplIds = projectEmplIds;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public double getProjectBudget() {
		return projectBudget;
	}
	public void setProjectBudget(double projectBudget) {
		this.projectBudget = projectBudget;
	}
	public int getEmplCount() {
		return emplCount;
	}
	public void setEmplCount(int emplCount) {
		this.emplCount = emplCount;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Integer getProjectManagerEmplId() {
		return projectManagerEmplId;
	}
	public void setProjectManagerEmplId(Integer projectManagerEmplId) {
		this.projectManagerEmplId = projectManagerEmplId;
	}
	public Integer getTechLeadEmplId() {
		return techLeadEmplId;
	}
	public void setTechLeadEmplId(Integer techLeadEmplId) {
		this.techLeadEmplId = techLeadEmplId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
