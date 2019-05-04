package com.meek.donald.model.location;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Location {
	@NotNull
	private Integer officeCount;
	@NotNull
	private String geoLocation;
	@NotNull
	private Integer mainOfficeId;
	@NotNull
	private Integer mgrId;
	@NotNull
	private String description;
	@NotNull
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer locId;
	
	public Integer getOfficeCount() {
		return officeCount;
	}
	public void setOfficeCount(Integer officeCount) {
		this.officeCount = officeCount;
	}
	public String getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}
	public Integer getMainOfficeId() {
		return mainOfficeId;
	}
	public void setMainOfficeId(Integer mainOfficeId) {
		this.mainOfficeId = mainOfficeId;
	}
	public Integer getMgrId() {
		return mgrId;
	}
	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getLocId() {
		return locId;
	}
	public void setLocId(Integer locId) {
		this.locId = locId;
	}
	
}
