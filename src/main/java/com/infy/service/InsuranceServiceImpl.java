package com.infy.service;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.dao.InsuranceDAO;
import com.infy.model.Policy;
import com.infy.model.PolicyReport;

public class InsuranceServiceImpl implements InsuranceService{

	@Autowired
	InsuranceDAO insuranceDao;
	
	public Policy buyPolicy(Policy policy){
		
		return this.insuranceDao.buyPolicy(policy);
	}

	public Integer calculateAge(LocalDate dateOfBirth){
		
		return (int) (Duration.between(dateOfBirth.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays() / 365);
	}
	
	public List<PolicyReport> getReport(String policyType){

		List<Policy> policies = this.insuranceDao.getAllPolicies();
		
		List<PolicyReport> reports = new ArrayList<PolicyReport>();
		
		for(Policy p : policies) {
			
			if(p.getPolicyType().equals(policyType)) {
				
				Integer age = this.calculateAge(p.getDateOfBirth());
				
				reports.add(new PolicyReport(p, age));
			}
		}
		
		return reports;
	}
	
}
