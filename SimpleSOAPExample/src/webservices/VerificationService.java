package webservices;
//This class checks whether the applicant has given appropriate details.
//The system checks if the ssn/salary/loan amount/phone number are abnormal
public class VerificationService {
	public String checkVerification(int ssn, int phoneNumber, int salary, int loanAmount) {
		if((ssn >= 1000 && ssn <= 2000) && (phoneNumber >= 100 && phoneNumber <= 200) && (salary >= 50000 && salary <= 500000) && (loanAmount >= 5000 && loanAmount <= 100000)) {
			return "verified";
		}
		else
			return "not verified";
	}
}