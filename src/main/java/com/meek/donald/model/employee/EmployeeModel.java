package com.meek.donald.model.employee;

import java.io.Serializable;

public class EmployeeModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer emplid;
	private String name;
	private String dept;
	private Integer emplsNum;
	private String addr;
	private Integer soch;
	private Integer officeId;
	private boolean active;
	
	public EmployeeModel() { }

	public Integer getOfficeId() {
		return officeId;
	}

	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Integer getEmplid() {
		return emplid;
	}

	public void setEmplid(Integer emplid) {
		this.emplid = emplid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getEmplsNum() {
		return emplsNum;
	}

	public void setEmplsNum(Integer emplsNum) {
		this.emplsNum = emplsNum;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getSoch() {
		return soch;
	}

	public void setSoch(Integer soch) {
		this.soch = soch;
	}
}
