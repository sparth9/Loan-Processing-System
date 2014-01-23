package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import webservices.CreditCheckService;

public class TestCreditCheckService {

	@Test
	public void testCheckCredit() {
		CreditCheckService creditCheck = new CreditCheckService();
		
		//method and its parameters
		//checkCredit(ssn);
		
		//when the input argument is valid
		String creditCheckOutput1 = creditCheck.checkCredit(1234);
		assertEquals(creditCheckOutput1, "good credit score");
		
		//when the input argument is invalid
		String creditCheckOutput2 = creditCheck.checkCredit(0);
		assertEquals(creditCheckOutput2, "poor credit score");
	}
}
