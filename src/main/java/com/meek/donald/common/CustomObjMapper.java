package com.meek.donald.common;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;

public class CustomObjMapper extends ObjectMapper{

		private static final long serialVersionUID = 1L;

		public CustomObjMapper() {
			super();
			configureToAllowDeserializationIntoBeanWithExtraFields();
		}

		private void configureToAllowDeserializationIntoBeanWithExtraFields() {
			super.configure(
					DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, 
					false);
		}
		
		@Override
		public ObjectMapper configure(JsonGenerator.Feature f, 
				boolean state) {
			throw new RuntimeException(
					"Prevent reconfiguration for object mapper in session");
		}
		
		@Override
		public ObjectMapper configure(DeserializationFeature f, 
				boolean state) {
			throw new RuntimeException(
					"Prevent reconfiguration for object mapper in session");
		}
		
		@Override
		public ObjectMapper configure(JsonParser.Feature f, boolean state) {
			throw new RuntimeException(
					"Prevent reconfiguration for object mapper in session");
		}
		
		@Override
		public ObjectMapper configure(SerializationFeature f, 
				boolean state) {
			throw new RuntimeException(
					"Prevent reconfiguration for object mapper in session");
		}
		
		@Override
		public ObjectMapper configure(MapperFeature f, boolean state) {
			throw new RuntimeException(
					"Prevent reconfiguration for object mapper in session");
		}
		
		public CustomObjMapper(ObjectMapper src) {
			super(src);
		}

		public CustomObjMapper(JsonFactory jf, 
				DefaultSerializerProvider sp, 
				DefaultDeserializationContext dc) {
			super(jf, sp, dc);
		}
		
		public CustomObjMapper(JsonFactory jf) {
			super(jf);
		}

}

