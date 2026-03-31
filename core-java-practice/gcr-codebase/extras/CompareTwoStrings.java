package extras;

import java.util.Scanner;

public class CompareTwoStrings {
	public static int compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0;i<minLength;i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1!=c2) {
                return c1 - c2; 
            }
        }
        return s1.length() - s2.length();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();
        
        int result = compareStrings(s1, s2);
        if (result == 0) {
            System.out.println("Both strings are equal");
        } 
        else if (result<0) {
            System.out.println("First string comes before second string");
        }
        else {
            System.out.println("First string comes after second string");
        }
	}
}
