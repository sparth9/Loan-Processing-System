package webservices;
//This class contains the web service which does the employment check
//of the applicant based on the applicant's ssn
public class EmploymentCheckService {
	public String checkEmployment(int ssn) {
		if(ssn >= 1000 && ssn <= 1500)
			return "employment verified";
		else
			return "employement not verified";
	}
}
