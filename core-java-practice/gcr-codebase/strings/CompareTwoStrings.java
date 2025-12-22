package strings;
import java.util.*;
public class CompareTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string ");
		String s1 = sc.next();
		System.out.println("Enter second string ");
		String s2 = sc.next();
		boolean res = true;
		if(s1.length()!=s2.length()) {
			res = false;
		}
		else {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					res = false;
					break;
				}
				
			}
		}
		System.out.println(res);
		
	}

}
