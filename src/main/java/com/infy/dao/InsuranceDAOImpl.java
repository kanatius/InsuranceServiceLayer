package com.infy.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.infy.model.Policy;

public class InsuranceDAOImpl implements InsuranceDAO {

	List<Policy> policies;

	public InsuranceDAOImpl() {

		this.policies = new ArrayList<Policy>();

		Policy policy1 = new Policy();
		policy1.setDateOfBirth(LocalDate.of(1989, 5, 10));
		policy1.setPolicyHolderName("Maria");
		policy1.setPolicyName("Retirement");
		policy1.setPolicyNumber("TL-309981");
		policy1.setPolicyType("Term Life Insurance");
		policy1.setPremium(5545.0d);
		policy1.setTenureInMonths(300);

		Policy policy2 = new Policy();
		policy2.setDateOfBirth(LocalDate.of(1987, 11, 23));
		policy2.setPolicyHolderName("Tom");
		policy2.setPolicyName("Retirement");
		policy2.setPolicyNumber("WP-774312");
		policy2.setPolicyType("Whole Life Policy");
		policy2.setPremium(6330.0);
		policy2.setTenureInMonths(300);

		Policy policy3 = new Policy();
		policy3.setDateOfBirth(LocalDate.of(1999, 4, 10));
		policy3.setPolicyHolderName("Pamela");
		policy3.setPolicyName("Retirement");
		policy3.setPolicyNumber("WP-900012");
		policy3.setPolicyType("Whole Life Policy");
		policy3.setPremium(3454.0);
		policy3.setTenureInMonths(360);

		Policy policy4 = new Policy();
		policy4.setDateOfBirth(LocalDate.of(1975, 10, 23));
		policy4.setPolicyHolderName("Roger");
		policy4.setPolicyName("AccidentalCoverage");
		policy4.setPolicyNumber("TL-552189");
		policy4.setPolicyType("Term Life Insurance");
		policy4.setPremium(7999.0);
		policy4.setTenureInMonths(100);

		Policy policy5 = new Policy();
		policy5.setDateOfBirth(LocalDate.of(2007, 11, 7));
		policy5.setPolicyHolderName("John M");
		policy5.setPolicyName("AccidentalCoverage");
		policy5.setPolicyNumber("TL-002319");
		policy5.setPolicyType("Term Life Insurance");
		policy5.setPremium(973.0);
		policy5.setTenureInMonths(420);

		Policy policy6 = new Policy();
		policy6.setDateOfBirth(LocalDate.of(2011, 1, 29));
		policy6.setPolicyHolderName("Joey T");
		policy6.setPolicyName("Retirement");
		policy6.setPolicyNumber("WP-991423");
		policy6.setPolicyType("Whole Life Policy");
		policy6.setPremium(554.0);
		policy6.setTenureInMonths(420);

		Policy policy7 = new Policy();
		policy7.setDateOfBirth(LocalDate.of(1993, 12, 31));
		policy7.setPolicyHolderName("Tim");
		policy7.setPolicyName("Pension");
		policy7.setPolicyNumber("WP-100098");
		policy7.setPolicyType("Whole Life Policy");
		policy7.setPremium(2876.0);
		policy7.setTenureInMonths(330);

		Policy policy8 = new Policy();
		policy8.setDateOfBirth(LocalDate.of(1983, 7, 1));
		policy8.setPolicyHolderName("Alia");
		policy8.setPolicyName("AccidentalCoverage");
		policy8.setPolicyNumber("WP-887132");
		policy8.setPolicyType("Whole Life Policy");
		policy8.setPremium(7887.0);
		policy8.setTenureInMonths(252);

		Policy policy9 = new Policy();
		policy9.setDateOfBirth(LocalDate.of(1964, 1, 17));
		policy9.setPolicyHolderName("Ranger");
		policy9.setPolicyName("Retirement");
		policy9.setPolicyNumber("WP-000057");
		policy9.setPolicyType("Whole Life Policy");
		policy9.setPremium(9345.0);
		policy9.setTenureInMonths(84);

		Policy policy10 = new Policy();
		policy10.setDateOfBirth(LocalDate.of(2014, 3, 10));
		policy10.setPolicyHolderName("Peter");
		policy10.setPolicyName("Retirement");
		policy10.setPolicyNumber("WP-678997");
		policy10.setPolicyType("Whole Life Policy");
		policy10.setPremium(432.0);
		policy10.setTenureInMonths(240);

		// inserting data when creating the DAO obj
		this.policies.add(policy1);
		this.policies.add(policy2);
		this.policies.add(policy3);
		this.policies.add(policy4);
		this.policies.add(policy5);
		this.policies.add(policy6);
		this.policies.add(policy7);
		this.policies.add(policy8);
		this.policies.add(policy9);
		this.policies.add(policy10);
	}

	public Policy buyPolicy(Policy policy) {
		this.policies.add(policy);
		return policy;
	}

	public List<Policy> getAllPolicies() {
		return this.policies;
	}

}
