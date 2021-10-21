package com.infy.model;

public class PolicyReport {
	
	private String policyNumber;
	private String policyHolderName;
	private Integer policyHolderAge;
	private Integer tenureInMonths;
	
	public PolicyReport(Policy policy, Integer age) {
		this.policyNumber = policy.getPolicyNumber();
		this.policyHolderName = policy.getPolicyHolderName();
		this.policyHolderAge = age;
		this.tenureInMonths = policy.getTenureInMonths();
	}
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public Integer getPolicyHolderAge() {
		return policyHolderAge;
	}
	public void setPolicyHolderAge(Integer policyHolderAge) {
		this.policyHolderAge = policyHolderAge;
	}
	public Integer getTenureInMonths() {
		return tenureInMonths;
	}
	public void setTenureInMonths(Integer tenureInMonths) {
		this.tenureInMonths = tenureInMonths;
	}
	
}
