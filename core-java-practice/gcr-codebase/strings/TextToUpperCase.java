package strings;
import java.util.Scanner;

public class TextToUpperCase {
	public static String convertToUpperCase(String s) {
		String res = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='a' && c<='z') {
				c=(char)(c-32);
			}
			res+=c;
		}
		return res;
	}
	public static boolean compareStrings(String userUpper,String builtIn) {
		for(int i=0;i<userUpper.length();i++) {
			if(userUpper.charAt(i)!=builtIn.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String s = sc.nextLine();
		String userUpper = convertToUpperCase(s);
		String builtIn = s.toUpperCase();
		
		System.out.println("User-defined uppercase: " + userUpper);
        System.out.println("Built-in uppercase: " + builtIn);
        System.out.println("Are both equal? " + compareStrings(userUpper, builtIn));
		
	}
}
