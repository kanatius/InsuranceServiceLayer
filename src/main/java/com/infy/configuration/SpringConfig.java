package com.infy.configuration;

import org.springframework.context.annotation.Bean;

import com.infy.dao.InsuranceDAOImpl;
import com.infy.service.InsuranceServiceImpl;

public class SpringConfig {
	
	@Bean
	public InsuranceDAOImpl insuranceDao() {
		return new InsuranceDAOImpl();
	}
	
	@Bean
	public InsuranceServiceImpl insuranceService() {
		return new InsuranceServiceImpl();
	}

}
