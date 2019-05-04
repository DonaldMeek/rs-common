package com.meek.donald.model.location;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Office {

	@NotNull
	private String address;
	@NotNull
	private Integer emplCount;
	@NotNull
	@Column(name = "founded_date", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private String foundedDate;
	@NotNull
	private Integer mgrId;
	@NotNull
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer officeId;
	@NotNull
	private Integer locId;
	@NotNull
	private String description;
	
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
	public Integer getMgrId() {
		return mgrId;
	}
	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}
	public Integer getOfficeId() {
		return officeId;
	}
	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}
	public Integer getLocId() {
		return locId;
	}
	public void setLocId(Integer locId) {
		this.locId = locId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
