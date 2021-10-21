package com.infy.ui;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.configuration.SpringConfig;
import com.infy.model.Policy;
import com.infy.model.PolicyReport;
import com.infy.service.InsuranceServiceImpl;

public class UserInterface {

	public static ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

	public static void main(String[] args) {

		try {
//			buyPolicy();
			generateReport();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void buyPolicy() throws Exception {
		
		Environment environment = null;
		
		try {
			environment = ctx.getEnvironment();
			
			InsuranceServiceImpl insuranceServiceImpl = ctx.getBean(InsuranceServiceImpl.class);
			
			Policy policy = new Policy();
			policy.setPolicyNumber("WL-553912");
			policy.setPolicyHolderName("James");
			policy.setDateOfBirth(LocalDate.of(1992, 01, 10));
			policy.setPolicyName("Retirement");
			policy.setPolicyType("Whole Life Policy");
			policy.setPremium(3500.0d);
			policy.setTenureInMonths(180);
			
			policy = insuranceServiceImpl.buyPolicy(policy);
			
			System.out.println("Policy has been bought");

//			System.out.println(environment.getProperty("UserInterface.SUCCESS") + "" + str1);

		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage());
			System.out.println(message);
		}
	}

	public static void generateReport() throws Exception {
		
		Environment environment = null;

		try {
			environment = ctx.getEnvironment();

			InsuranceServiceImpl insuranceServiceImpl = ctx.getBean(InsuranceServiceImpl.class);
//			List<PolicyReport> list1 = insuranceServiceImpl.getReport("Term Life Insurance");
			
			List<PolicyReport> list1=insuranceServiceImpl.getReport("Whole Life Policy");
			if (list1 != null) {
				System.out.println(
						"Policy Holder Name" + "\t" + "Policy Number" + "\t" + "Age(in months)" + "\t" + "Tenure");
				System.out.println("================================================================");
				for (PolicyReport p : list1) {
					System.out.println(p.getPolicyHolderName() + "\t\t\t" + p.getPolicyNumber() + "\t"
							+ p.getPolicyHolderAge() + "\t\t" + p.getTenureInMonths());
				}
			}

		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage());
			System.out.println(message);
		}
	}
}
