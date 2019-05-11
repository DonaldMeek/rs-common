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
		return proj;
	}
}
