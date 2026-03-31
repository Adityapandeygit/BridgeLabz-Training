package extras;

import java.util.Scanner;

public class SubstringOccurrences {
	public static int countSubString(String s , String sub) {
		int count = 0;
	    int windowSize = sub.length();

	    for (int i=0;i<=s.length()-windowSize;i++) {
	        if (s.substring(i, i + windowSize).equals(sub)) {
	            count++;
	        }
	    }
	    return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		System.out.println("Enter substring:");
        String sub = sc.nextLine();
		System.out.println("Count of substring :"+ countSubString(s,sub));
	}
}
