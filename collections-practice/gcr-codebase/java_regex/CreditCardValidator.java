package collections_practice.gcr_codebase.java_regex;

public class CreditCardValidator {
	public static void main(String[] args) {
		String visaRegex = "^4\\d{15}$";
		String masterRegex = "^5\\d{15}$";
		String s1 = "42321367867";
		System.out.println(s1.matches(visaRegex));
		System.out.println(s1.matches(masterRegex));
	}
}
