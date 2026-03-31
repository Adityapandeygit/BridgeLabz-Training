package m1.submitDetails;

import java.util.regex.Pattern;

public class Implementation {
	public String validator(Person details) throws InvalidEMailException,InvalidDateException{
		String[] s = details.dateOfBirth.split("-");
		int n = Integer.parseInt(s[2]);
		if(n>2000) {
			throw new InvalidDateException("Date must be less than 2000");
		}
		String regex = "[a-zA-Z0-9+._-]+@doselect.com";
		if(!Pattern.matches(regex, details.email)) {
			throw new InvalidEMailException("email is invalid");
		}
		return "Valid Details";
	}
	public String submitDetails(Person details) {
		try {
			if(validator(details).equals("Valid Details")) {
				return "details submited successfully";
			}
		}
		catch(InvalidEMailException e) {
			System.out.println(e.getMessage());
			return "Invalid details";
		}
		catch(InvalidDateException e) {
			System.out.println(e.getMessage());
			return "Invalid details";
		}
		return "other exception";
	}
}
