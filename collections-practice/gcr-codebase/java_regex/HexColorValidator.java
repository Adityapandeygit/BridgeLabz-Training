package collections_practice.gcr_codebase.java_regex;

import java.util.regex.Pattern;

public class HexColorValidator {
	public static void main(String[] args) {
		String regex = "^#[0-9A-Fa-f]{6}$";
		Pattern pattern = Pattern.compile(regex);
		
		System.out.println("#FFA500".matches(regex)); 
	    System.out.println("#ff4500".matches(regex)); 
	    System.out.println("#123".matches(regex)); 
	}
}
