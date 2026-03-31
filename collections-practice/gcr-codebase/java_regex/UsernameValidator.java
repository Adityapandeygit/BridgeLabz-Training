package collections_practice.gcr_codebase.java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
	public static void main(String[] args) {
		String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
		Pattern pattern = Pattern.compile(regex);
		
		String s1 = "user_123";
		String s2 = "123user";
		System.out.println(s1.matches(regex));
		System.out.println(s2.matches(regex));
	}
}	
