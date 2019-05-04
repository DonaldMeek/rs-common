package com.meek.donald.model.employee;

import java.io.Serializable;

public class EmployeeModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer emplId;
	private String name;
	private String dept;
	private Integer employeeCount;
	private String address;
	private Integer soch;
	private Integer officeId;
	private boolean active;
	
	public EmployeeModel() { }

	public Integer getEmplId() {
		return emplId;
	}

	public void setEmplId(Integer emplId) {
		this.emplId = emplId;
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

	public Integer getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(Integer employeeCount) {
		this.employeeCount = employeeCount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getSoch() {
		return soch;
	}

	public void setSoch(Integer soch) {
		this.soch = soch;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
