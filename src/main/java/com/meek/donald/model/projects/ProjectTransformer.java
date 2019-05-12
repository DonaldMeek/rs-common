package com.meek.donald.model.projects;

public class ProjectTransformer {

	public static Project transformProjectModel(ProjectModel projModel) {
		
		Project proj = new Project();
		proj.setActive(projModel.isActive());
		proj.setDescription(projModel.getDescription());
		proj.setEmplCount(projModel.getEmplCount());
		proj.setEndDate(projModel.getEndDate());
		proj.setStartDate(projModel.getEndDate());
		proj.setProjectBudget(projModel.getProjectBudget());
		proj.setProjectName(projModel.getProjectName());
		proj.setProjectType(projModel.getProjectName());
		proj.setProjId(projModel.getProjectId());
		proj.setTechLeadId(projModel.getTechLeadEmplId());
		proj.setProjMgrId(projModel.getProjectManagerEmplId());
		proj.setProjectOfficeId(projModel.getOfficeId());
		return proj;
	}
	
	public static ProjectModel transformProject(Project proj) {
		
		ProjectModel projectModel = new ProjectModel();
		projectModel.setActive(proj.getActive());
		projectModel.setDescription(proj.getDescription());
		projectModel.setEmplCount(proj.getEmplCount());
		projectModel.setEndDate(proj.getEndDate());
		projectModel.setStartDate(proj.getEndDate());
		projectModel.setProjectBudget(proj.getProjectBudget());
		projectModel.setProjectName(proj.getProjectName());
		projectModel.setProjectType(proj.getProjectName());
		projectModel.setProjectId(proj.getProjId());
		projectModel.setTechLeadEmplId(proj.getTechLeadId());
		projectModel.setProjectManagerEmplId(proj.getProjMgrId());
		projectModel.setOfficeId(proj.getProjectOfficeId());
		return projectModel;
	}
}
