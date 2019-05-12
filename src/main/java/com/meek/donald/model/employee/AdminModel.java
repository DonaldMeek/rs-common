package com.meek.donald.model.employee;

import java.io.Serializable;
import java.util.List;

public class AdminModel implements Serializable{

	private static final long serialVersionUID = -8979191138013527871L;
	private boolean rootAccess;
	private List<String> serversWithAccess;
	private List<String> databasesWithAccess;
	private boolean isManager;
	private String social;
	private String role;
	private Permission permissions;
	
	public boolean isRootAccess() {
		return rootAccess;
	}
	public void setRootAccess(boolean rootAccess) {
		this.rootAccess = rootAccess;
	}
	public List<String> getServersWithAccess() {
		return serversWithAccess;
	}
	public void setServersWithAccess(List<String> serversWithAccess) {
		this.serversWithAccess = serversWithAccess;
	}
	public List<String> getDatabasesWithAccess() {
		return databasesWithAccess;
	}
	public void setDatabasesWithAccess(List<String> databasesWithAccess) {
		this.databasesWithAccess = databasesWithAccess;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Permission getPermissions() {
		return permissions;
	}
	public void setPermissions(Permission permissions) {
		this.permissions = permissions;
	}

}
