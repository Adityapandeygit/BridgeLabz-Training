package collections_practice.gcr_codebase.java_regex;

import java.util.regex.Pattern;

public class LicensePlateNumber {
	public static void main(String[] args) {
		String regex = "^[A-Z]{2}[0-9]{4}";
		Pattern pattern = Pattern.compile(regex);
		
		String s1 = "AB1234";
		String s2 = "123user";
		System.out.println(s1.matches(regex));
		System.out.println(s2.matches(regex));
	}
}
