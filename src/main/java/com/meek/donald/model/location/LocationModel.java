package com.meek.donald.model.location;

import java.util.List;

public class LocationModel {

	int officeCount;
	String geoLocation;
	String primaryOfficeId;
	Integer regionalCoordinatorEmplId;
	String description;
	Integer locationId;
	List<OfficeModel> locationOffices;
	
	public int getOfficeCount() {
		return officeCount;
	}
	public void setOfficeCount(int officeCount) {
		this.officeCount = officeCount;
	}
	public List<OfficeModel> getLocationOffices() {
		return locationOffices;
	}
	public void setLocationOffices(List<OfficeModel> locationOffices) {
		this.locationOffices = locationOffices;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public String getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}
	public String getPrimaryOfficeId() {
		return primaryOfficeId;
	}
	public void setPrimaryOfficeId(String primaryOfficeId) {
		this.primaryOfficeId = primaryOfficeId;
	}
	public Integer getRegionalCoordinatorEmplId() {
		return regionalCoordinatorEmplId;
	}
	public void setRegionalCoordinatorEmplId(Integer regionalCoordinatorEmplId) {
		this.regionalCoordinatorEmplId = regionalCoordinatorEmplId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
