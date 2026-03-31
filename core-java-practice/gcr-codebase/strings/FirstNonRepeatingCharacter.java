package strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static char firstNonRepeatingChar(String str) {
		int[] freq = new int[26]; 

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c-'a']++;
        }
        
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (freq[c-'a'] == 1) {
                return c;
            }
        }

        return '\0';
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char result = firstNonRepeatingChar(str);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
