package extras;

import java.util.*;

public class RemoveDuplicates {
	public static String removeDuplicate(String s) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		String removeDuplicate = "";
		for(char c :set) {
			removeDuplicate += c;
		}
		return removeDuplicate;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		System.out.println("String after removing duplicates :" +removeDuplicate(s));
		
	}
}
