package collections_practice.gcr_codebase.java_regex;

public class ValidateIPAddress {
	public static void main(String[] args) {
		String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}" +
		        "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
		String s1 = "255.255.255.0";
		String s2 = "255.255.255";
		
		System.out.println(s1.matches(regex));
		System.out.println(s2.matches(regex));
	}
}
