package extras;

import java.util.Scanner;

public class PalindromeStringCheck {
	public static String reverse(String s) {
		String rev = "";
		for(int i=0;i<s.length();i++) {
			rev = s.charAt(i)+rev;
		}
		return rev ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		String reverse = reverse(s);
		if(s.equals(reverse)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not a Palindrome");
		}
	}
}
