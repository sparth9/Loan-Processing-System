package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import webservices.EmploymentCheckService;

public class TestEmploymentService {

	@Test
	public void testCheckEmployment() {
		
		EmploymentCheckService employmentCheck = new EmploymentCheckService();
		
		//Method and its parameters : checkVerification(ssn, phoneNumber, salary, loanAmount);
		//input argument is valid
		String employmentOutput1 = employmentCheck.checkEmployment(1234);
		assertEquals(employmentOutput1,"employment verified");
		
		//input argument is invalid
		String employmentOutput2 = employmentCheck.checkEmployment(123);
		assertEquals(employmentOutput2,"employement not verified");
	}
}
