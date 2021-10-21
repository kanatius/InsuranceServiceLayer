package com.infy.model;

public class PolicyReport {
	private Integer policyNumber;
	private String policyHolderName;
	private Double policyHolderAge;
	private Integer tenureInMonths;
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public Double getPolicyHolderAge() {
		return policyHolderAge;
	}
	public void setPolicyHolderAge(Double policyHolderAge) {
		this.policyHolderAge = policyHolderAge;
	}
	public Integer getTenureInMonths() {
		return tenureInMonths;
	}
	public void setTenureInMonths(Integer tenureInMonths) {
		this.tenureInMonths = tenureInMonths;
	}
	
}
