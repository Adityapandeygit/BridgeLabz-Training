package extras;

import java.util.Scanner;

public class ToggleCaseCharacters {
	
	public static String toggleCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i =0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } 
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } 
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		System.out.println("After toggling case: " + toggleCase(s));
	}
}
