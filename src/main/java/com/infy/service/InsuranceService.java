package com.infy.service;

import java.time.LocalDate;
import java.util.List;

import com.infy.model.Policy;
import com.infy.model.PolicyReport;

public interface InsuranceService {
	
	public String buyPolicy(Policy policy) throws Exception;
	public Long calculateAge(LocalDate dateOfBirth) throws Exception;
	public List<PolicyReport> getReport(String insuranceType) throws Exception;
	

}
