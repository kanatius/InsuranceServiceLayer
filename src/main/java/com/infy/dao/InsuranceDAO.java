package com.infy.dao;

import java.util.List;

import com.infy.model.Policy;

public interface InsuranceDAO {

	public String buyPolicy(Policy policy) throws Exception;
	public List<Policy> getAllPolicyDetails() throws Exception;
	
	
}
