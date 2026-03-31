package core_java_practice.scanrio_based;

import java.util.Scanner;

public class FlipKey {
	public static boolean isSpecial(char ch) {
        return !Character.isLetter(ch);
    }
	
	public static String CleanseAndInvert(String input) {
		if(input==null || input.length()<6) {
			return "";
		}
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch==' ' || Character.isDigit(ch) || isSpecial(ch)) {
				return " ";
			}
		}
		String lower = input.toLowerCase();
		StringBuilder sb = new StringBuilder(lower);
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)%2==0) {
				sb.deleteCharAt(sb.charAt(i));
			}
		}
		StringBuilder reverse = sb.reverse();
		for(int i=0;i<reverse.length();i++) {
			if(i%2==0) {
				char ch = Character.toUpperCase(reverse.charAt(i));
				reverse.setCharAt(i, ch);
			}
		}
		return reverse.toString();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(CleanseAndInvert(s));
	}
}


