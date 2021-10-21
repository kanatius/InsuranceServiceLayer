package com.infy.dao;

import java.util.List;

import com.infy.model.Policy;

public interface InsuranceDAO {

	public Policy buyPolicy(Policy policy);
	public List<Policy> getAllPolicies();
	
	
}
