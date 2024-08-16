package com.example.EmployeeWebService.employee;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class EmployeeConfig {

	@Bean
	public ModelMapper modelMapperBean() {
		return new ModelMapper();
	}

	@Bean
	public RestTemplate restTemplateBean() {
		return new RestTemplate();
	}

}
