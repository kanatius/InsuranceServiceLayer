package com.infy.service;

import java.time.LocalDate;
import java.util.List;

import com.infy.model.Policy;
import com.infy.model.PolicyReport;

public interface InsuranceService {
	
	public Policy buyPolicy(Policy policy);
	public Integer calculateAge(LocalDate dateOfBirth);
	public List<PolicyReport> getReport(String insuranceType);
	

}
