package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import webservices.VerificationService;

public class TestVerificationService {

	@Test
	public void testCheckVerification() {
		VerificationService verification = new VerificationService();
		
		
		//Method and its parameters : checkVerification(ssn, phoneNumber, salary, loanAmount);
		
		//all input arguments are valid
		String verificationOutput1 = verification.checkVerification(1234, 150, 50000, 5000);
		assertEquals(verificationOutput1,"verified");
		
		//ssn is invalid
		String verificationOutput2 = verification.checkVerification(-5, 100, 50000, 5000);
		assertEquals(verificationOutput2,"not verified");
		
		//phoneNumber is invalid
		String verificationOutput3 = verification.checkVerification(1234, -2, 50000, 5000);
		assertEquals(verificationOutput3,"not verified");
		
		//salary is invalid
		String verificationOutput4 = verification.checkVerification(1234, 150, -5, 5000);
		assertEquals(verificationOutput4,"not verified");
		
		//loanAmount is invalid
		String verificationOutput5 = verification.checkVerification(1234, 123, 50000, 0);
		assertEquals(verificationOutput5,"not verified");
	}
}
