package com.infy.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.dao.InsuranceDAO;
import com.infy.dao.InsuranceDAOImpl;
import com.infy.model.Policy;
import com.infy.model.PolicyReport;

public class InsuranceServiceImpl implements InsuranceService{

	@Autowired
	InsuranceDAO insuranceDao;
	
	
	public String buyPolicy(Policy policy) throws Exception {
		
		return this.insuranceDao.buyPolicy(policy);
	}

	public Long calculateAge(LocalDate dateOfBirth) throws Exception {
		
		return null;
	}
	
	public List<PolicyReport> getReport(String policyType) throws Exception {

		return null;
		
	}
	
}
