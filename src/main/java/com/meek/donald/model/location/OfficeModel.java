package com.meek.donald.model.location;

import java.util.List;
import java.util.Map;

import com.meek.donald.model.employee.EmployeeModel;

public class OfficeModel {

	String address;
	Integer emplCount;
	String foundedDate;
	Integer officeCoordinatorId;
	Integer numOfOffices;
	Integer numOfMeetingRooms;
	Map<Integer, EmployeeModel> 
		officeEmployeesIndexedByManagerId;
	String description;
	Integer officeId;
	Integer locationId;
	List<EmployeeModel> officeEmployees;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getEmplCount() {
		return emplCount;
	}
	public void setEmplCount(Integer emplCount) {
		this.emplCount = emplCount;
	}
	public String getFoundedDate() {
		return foundedDate;
	}
	public void setFoundedDate(String foundedDate) {
		this.foundedDate = foundedDate;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public Map<Integer, EmployeeModel> getOfficeEmployeesIndexedByManagerId() {
		return officeEmployeesIndexedByManagerId;
	}
	public void setOfficeEmployeesIndexedByManagerId(Map<Integer, 
			EmployeeModel> officeEmployeesIndexedByManagerId) {
		this.officeEmployeesIndexedByManagerId = officeEmployeesIndexedByManagerId;
	}
	public Integer getOfficeCoordinatorId() {
		return officeCoordinatorId;
	}
	public void setOfficeCoordinatorId(Integer officeCoordinatorId) {
		this.officeCoordinatorId = officeCoordinatorId;
	}
	public Integer getNumOfOffices() {
		return numOfOffices;
	}
	public void setNumOfOffices(Integer numOfOffices) {
		this.numOfOffices = numOfOffices;
	}
	public Integer getNumOfMeetingRooms() {
		return numOfMeetingRooms;
	}
	public void setNumOfMeetingRooms(Integer numOfMeetingRooms) {
		this.numOfMeetingRooms = numOfMeetingRooms;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getOfficeId() {
		return officeId;
	}
	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}
	public List<EmployeeModel> getOfficeEmployees() {
		return officeEmployees;
	}
	public void setOfficeEmployees(List<EmployeeModel> officeEmployees) {
		this.officeEmployees = officeEmployees;
	}
	
}
