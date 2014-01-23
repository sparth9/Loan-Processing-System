package webservices;
//This class contains the web service which check the credit score of the
//loan applicant. The system checks the credit score based on the ssn of 
//the applicant.
public class CreditCheckService {
	
	public String checkCredit(int ssn) {
		if(ssn >= 1000 && ssn <= 1500)
			return "good credit score";
		else
			return "poor credit score";
	}
}
