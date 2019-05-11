package com.meek.donald.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;

public class BaseServiceImpl extends BaseService {

	
	public BaseServiceImpl() {
		if ((super.propertiesLoaded == null) || 
				(super.propertiesLoaded.booleanValue() == false))
		{ 
			loadUrlProperties(); 
			propertiesLoaded = new Boolean(true);
		}
	}
	
	public void loadUrlProperties() {
		InputStream inputPropertyStream = null;
		try {
			inputPropertyStream = 
					getClass().getResourceAsStream("/service_url.properties");
			Properties uriProp = new Properties();
			uriProp.load(inputPropertyStream);
			super.baseUrl = uriProp.getProperty("service.url.host")
					+ ":" + uriProp.getProperty("service.url.port");
			setApplicationUriValues(uriProp);
			inputPropertyStream.close();
		}
		catch(IOException ioe) {
			System.out.println("Failed to load properties file");
		}
	}
	
	public void validateServiceResponse(ResponseEntity<String> serviceResponse) 
			throws HttpServerErrorException {
		if (serviceResponse == null || 
				!serviceResponse.getStatusCode().equals(HttpStatus.OK)) {
			throw new HttpServerErrorException(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	private void setApplicationUriValues(Properties uriProp) {
		setEmployeeUri(uriProp);
		setEmplIdUri(uriProp);
	}
	
	public HttpHeaders getDefaultHttpRequestHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}
	
	private void setEmployeeUri(Properties appUriProp) {
		super.employeeUri = appUriProp.getProperty("service.url.employee");
	}
	
	private void setEmplIdUri(Properties appUriProp) {
		super.emplIdUri = appUriProp.getProperty("service.url.employee.id");
	}
	
	public boolean isPropertiesLoaded() {
		return super.propertiesLoaded.booleanValue();
	}
	
	public String getBaseUrl() {
		return super.baseUrl;
	}
	
	public String getEmployeeUri() {
		return super.employeeUri;
	}
	
	public String getEmplIdUri() {
		return super.emplIdUri;
	}
	public String getOfficesLocIdUri() {
		return super.officesLocIdUri;
	}
	public void setOfficesLocIdUri(Properties appUriProp) {
		super.officesLocIdUri = appUriProp.getProperty("service.url.office.location.id");
	}
	public String getOfficeLocExampleUri() {
		return officeLocExampleUri;
	}
	public void setOfficeLocExampleUri(Properties appUriProp) {
		super.officeLocExampleUri = appUriProp.getProperty("service.url.office.location.example");
	}
	public String getOfficeEmplByManagerIdUri() {
		return officeEmplByManagerIdUri;
	}
	public void setOfficeEmplByManagerIdUri(Properties appUriProp) {
		super.officeEmplByManagerIdUri = appUriProp.getProperty("service.url.office.empl.manager.id");
	}
	public String getEmplOfficeIdUri() {
		return emplOfficeIdUri;
	}
	public void setEmplOfficeIdUri(Properties appUriProp) {
		super.emplOfficeIdUri = appUriProp.getProperty("service.url.empl.office.id");
	}
	public String getOfficeEmplIdUri() {
		return officeEmplIdUri;
	}
	public void setOfficeEmplIdUri(Properties appUriProp) {
		super.officeEmplIdUri = appUriProp.getProperty("service.url.office.empl.id");
	}
	public String getAllActiveProjectUri() {
		return allActiveProjectUri;
	}
	public void setAllActiveProjectUri(Properties appUriProp) {
		super.allActiveProjectUri = appUriProp.getProperty("service.url.project.all.active");
	}
	public String getOfficeByProjectExampleUri() {
		return officeByProjectExampleUri;
	}
	public void setOfficeByProjectExampleUri(Properties appUriProp) {
		super.officeByProjectExampleUri = appUriProp.getProperty("service.url.project.office.example");
	}
	public String getEmplByLocExampleUri() {
		return emplByLocExampleUri;
	}
	public void setEmplByLocExampleUri(Properties appUriProp) {
		super.emplByLocExampleUri = appUriProp.getProperty("service.url.location.emloyee.example");
	}
	public String getEmplLocIdUri() {
		return emplLocIdUri;
	}
	public void setEmplLocIdUri(Properties appUriProp) {
		super.emplLocIdUri = appUriProp.getProperty("service.url.location.employee.id");
	}
	public String getOfficeLocIdUri() {
		return officeLocIdUri;
	}
	public String getProjectEmplIdsUri() {
		return projectEmplIdsUri;
	}
	public void setProjectEmplIdsUri(Properties appUriProp) {
		super.emplLocIdUri = appUriProp.getProperty("service.url.project.empl.id");
	}
	public void setOfficeLocIdUri(Properties appUriProp) {
		super.officeLocIdUri = appUriProp.getProperty("service.url.location.office.id");
	}
}