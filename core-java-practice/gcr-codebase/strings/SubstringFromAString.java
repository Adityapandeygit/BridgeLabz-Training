package strings;
import java.util.*;
public class SubstringFromAString {
	public static boolean compareString(String str) {
		String s1 = str.substring(1,4);
		System.out.println(s1);
		String s2 = "";
		for(int i=1;i<4;i++) {
			s2+=str.charAt(i);
		}
		System.out.println(s2);
		
		if(s1.equals(s2)) {
			return true;
		}
		else {
			return false;
		}

		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String str = sc.next();
		System.out.println(compareString(str));
		
		
		
	}
}
