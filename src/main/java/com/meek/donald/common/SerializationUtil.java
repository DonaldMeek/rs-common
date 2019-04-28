package com.meek.donald.common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

public class SerializationUtil {
	
	static boolean mapperDefined = false;
	
	static final public ObjectMapper mapper = new CustomObjMapper();
	
	public synchronized static void init(){
		// Define SerializationUtil with mapper for current session
		synchronized (mapper) {
		}	
	}
	
	public static String getJson(List<? extends Object> beanList) 
			throws JsonGenerationException, JsonMappingException, 
			IOException {
		String serializedList = null;
		final OutputStream outStream = new ByteArrayOutputStream();
		
		if(!mapperDefined) {
			init();
			mapperDefined = true;
		}
		mapper.writeValue(outStream, beanList);
		serializedList = new String(((
				ByteArrayOutputStream) outStream).toByteArray());
		
		return serializedList;
	}
	public static Object getBean(String requestBean, 
			Class<?> requestBeanClass) throws JsonParseException, 
			JsonMappingException, IOException{
		if(!mapperDefined) {
			init();
			mapperDefined = true;
		}
		
		return mapper.readValue(requestBean,requestBeanClass);
	}
	
	public static String getJson(Object bean) 
			throws JsonProcessingException{
		ObjectWriter objectWriter = null;
		String serializedBean = null;
		if(!mapperDefined) {
			init();
			mapperDefined = true;
		}
		
		objectWriter = mapper.writer().withDefaultPrettyPrinter();
		serializedBean = objectWriter.writeValueAsString(bean);
		return serializedBean;
	}
	
	public static ObjectMapper getObjectMapper() {
		if(!mapperDefined) {
			init();
			mapperDefined = true;
		}
		return mapper;
	}

	public static ObjectReader getObjectReader() {
		if(!mapperDefined) {
			init();
			mapperDefined = true;
		}
		return mapper.reader();
	}

	public static ObjectWriter getObectWritter() {
		if(!mapperDefined) {
			init();
			mapperDefined = true;
		}
		return mapper.writer();
	}
}
