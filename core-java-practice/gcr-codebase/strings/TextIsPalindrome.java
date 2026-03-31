package strings;

import java.util.Scanner;

public class TextIsPalindrome {
	public static boolean isPalindromeLogic1(String str) {
		int start = 0;
		int end = str.length()-1;
		while(start<=end) {
			if(str.charAt(start)!=str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static boolean isPalindromeLogic2(String str,int start,int end) {
		
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		return isPalindromeLogic2(str,start+1,end-1);
	
	}
	
	public static boolean isPalindromeLogic3(String str,int start,int end) {
		char[] original = str.toCharArray();
		int len = str.length();
        char[] reverse = new char[len];
        for (int i = 0; i < len; i++) {
            reverse[i] = str.charAt(len-1-i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(isPalindromeLogic1(str));
		System.out.println(isPalindromeLogic2(str,0,str.length()-1));
		System.out.println(isPalindromeLogic3(str, 0, str.length()-1));
	}
}
