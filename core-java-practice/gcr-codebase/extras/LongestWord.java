package extras;

import java.util.Scanner;

public class LongestWord {
	public static String longestWord(String s) {
		String[] arr = s.split(" ");
		String largestString = "";
		
		for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > largestString.length()) {
            	largestString = arr[i];
            }
        }
		
		return largestString;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String :");
	String s = sc.nextLine();
	System.out.println("Longest Word in a Sentence :" + longestWord(s));
}
}
