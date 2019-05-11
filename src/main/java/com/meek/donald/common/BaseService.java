package com.meek.donald.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public abstract class BaseService {

	protected Boolean propertiesLoaded;
	protected String baseUrl;
	protected String employeeUri;
	protected String emplIdUri;
	protected String officesLocIdUri;
	protected String officeLocExampleUri;
	protected String officeEmplByManagerIdUri;
	protected String emplOfficeIdUri;
	protected String officeEmplIdUri;
	protected String allActiveProjectUri;
	protected String officeByProjectExampleUri;
	protected String projectEmplIdsUri;
	protected String emplByLocExampleUri;
	protected String emplLocIdUri;
	protected String officeLocIdUri;
	
	abstract void loadUrlProperties();
	abstract HttpHeaders getDefaultHttpRequestHeaders();
	abstract void validateServiceResponse(ResponseEntity<String> serviceResponse);

	
}
