package extras;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static boolean isVowel(char ch) {
		return ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' ||
				ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U';
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		int countc = 0;
		int countv = 0;
		for(int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				countv++;
			}
			else {
				countc++;
			}
		}
		System.out.println("Vowel count :" + countv);
		System.out.println("Consonant count :" + countc);
	}
}
