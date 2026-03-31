package extras;

import java.util.Scanner;

public class RemoveSpecificCharacter {
	public static String removeCharacter(String s, char ch) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Enter character to remove:");
        char ch = sc.next().charAt(0);
        System.out.println("Modified String: " + removeCharacter(s, ch) + "\"");
    }
}
