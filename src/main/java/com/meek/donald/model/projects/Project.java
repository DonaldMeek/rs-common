package com.meek.donald.model.projects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo="project")
public class Project {
	@NotNull
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer projId;
	@NotNull
	private String projectType;
	@NotNull
	private Double projectBudget;
	@NotNull
	private Integer emplCount;
	@NotNull
	@Column(name = "start_date", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private String startDate;
	@Column(name = "end_date", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private String endDate;
	@NotNull
	private Integer projMgrId;
	@NotNull
	private Integer techLeadId;
	@NotNull
	private String description;
	@NotNull
	private String projectName;
	@NotNull
	private Boolean active;
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public Double getProjectBudget() {
		return projectBudget;
	}
	public void setProjectBudget(Double projectBudget) {
		this.projectBudget = projectBudget;
	}
	public Integer getEmplCount() {
		return emplCount;
	}
	public void setEmplCount(Integer emplCount) {
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
	public Integer getProjMgrId() {
		return projMgrId;
	}
	public void setProjMgrId(Integer projMgrId) {
		this.projMgrId = projMgrId;
	}
	public Integer getTechLeadId() {
		return techLeadId;
	}
	public void setTechLeadId(Integer techLeadId) {
		this.techLeadId = techLeadId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
