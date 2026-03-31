package dsa_practice.gcr_codebase.stringBuilderandstringBuffer;

import java.util.Scanner;
import java.util.*;
public class RemoveDuplicates {
	public static String removeDuplicate(String s) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(!set.contains(c)) {
				sb.append(c);
			}
			set.add(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		System.out.println(removeDuplicate(s));
	}
}
