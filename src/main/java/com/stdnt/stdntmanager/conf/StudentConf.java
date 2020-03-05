package com.stdnt.stdntmanager.conf;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConf {
	
	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}

}
