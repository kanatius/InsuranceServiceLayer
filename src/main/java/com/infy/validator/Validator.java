package com.infy.validator;

import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import com.infy.model.Policy;

public class Validator {

	static final String INVALID_POLICY_NUMBER = "Invalid Policy Number";
	static final String INVALID_POLICY_TYPE = "Invalid Policy Type";
	static final String INVALID_HOLDER_NUMBER = "Invalid Policy Holder Number";
	static final String INVALID_POLICY_NAME = "Invalid Policy Name";
	static final String INVALID_DOB = "Invalid Dob";
	static final String INVALID_PREMIUM = "Invalid Premium";
	static final String INVALID_TENURE = "Invalid Tenure";
	
	
	public static void validate(Policy policy) throws Exception {
		
		if(validatePolicyName(policy.getPolicyName())) {
			System.out.println("Policy Name is Valid!");
		}else {
			System.out.println("Policy Name is NOT Valid!");
		}
		
		if(validatePolicyType(policy.getPolicyType())) {
			System.out.println("Policy Type is Valid!");
		}else {
			System.out.println("Policy Type is NOT Valid!");
		}
		
		if(validatePremium(policy.getPremium())) {
			System.out.println("Policy Premium is Valid!");
		}else {
			System.out.println("Policy Premium is NOT Valid!");
		}
		
		if(validateTenure(policy.getTenureInMonths())) {
			System.out.println("Policy Tenures are Valid!");
		}else {
			System.out.println("Policy Tenures are NOT Valid!");
		}
		
		if(validateDateOfBirth(policy.getDateOfBirth())) {
			System.out.println("Policy Date of Birth is Valid!");
		}else {
			System.out.println("Policy Date of Birth is NOT Valid!");
		}
		
		if(validatePolicyNumber(policy.getPolicyNumber(), policy.getPolicyType())) {
			System.out.println("Policy Number is Valid!");
		}else {
			System.out.println("Policy Number is NOT Valid!");
		}
		
		if(validatePolicyHolderName(policy.getPolicyHolderName())) {
			System.out.println("Policy Holder Name is Valid!");
		}else {
			System.out.println("Policy Holder Name is NOT Valid!");
		}
		
	}

	
	public static Boolean validatePolicyName(String policyName) throws Exception {
		
		//checks whether the string length is greater than 0 and policy name does not contains any special char or spaces
		if(policyName.length() > 0 && !policyName.matches("[^a-zA-Z]")) {
			
			return true;
		}
		return false;
	}

	public static Boolean validatePolicyType(String policyType) {
		
		if (policyType.equals("Term Life Insurance") || policyType.equals("Whole Life Policy") || policyType.equals("Endowment Plans")) {
			return true;
		}
		
		return false;
	}

	public static Boolean validatePremium(Double premium) {
		return (premium > 100) ? true : false;
	}

	public static Boolean validateTenure(Integer tenureInMonths) {

		return (tenureInMonths > 24) ? true : false; 
	}

	public static Boolean validateDateOfBirth(LocalDate dateOfBirth) {

		return dateOfBirth.isBefore(LocalDate.now()) ? true : false;
	}

	public static Boolean validatePolicyNumber(String policyNumber, String policyType) {

		if (policyNumber.matches("^(?:TL|WL|EP)-[0-9]{6}$")) {
			
			Pattern codePattern = Pattern.compile("^(?:TL|WL|EP)-[0-9]{6}$");
			
			Matcher matcher = codePattern.matcher(policyNumber);
			
			String policyCode = matcher.group(1);
			
			if(policyCode.equals("TL") && policyType.equals("TL")){
				return true;
			}
			if(policyCode.equals("WL") && policyType.equals("WL")){
				return true;
			}
			if(policyCode.equals("EP") && policyType.equals("EP")){
				return true;
			}	
		}
		
		return false;
	}

	public static Boolean validatePolicyHolderName(String policyHolderName) {

		policyHolderName = policyHolderName.trim();
		
		Pattern wordPattern = Pattern.compile("[a-zA-Z]{3,}");
		
		Matcher wordMatcher = wordPattern.matcher(policyHolderName);
		
		
		if (wordMatcher.groupCount() == 0) {
			return false;
		} 
		
		if (wordMatcher.groupCount() == 1) {
			return true;
		}
		
		if(wordMatcher.groupCount() > 1) {
			
			if (policyHolderName.matches("^([a-zA-Z]{3,} )+ [a-zA-Z]{3,}")){
				return true;
			}
			
			return false;
			
		}
		
		return false;
	}

}
