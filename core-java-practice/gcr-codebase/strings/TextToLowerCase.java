package strings;
import java.util.Scanner;

public class TextToLowerCase {
	public static String convertToLowerCase(String s) {
		String res = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A' && c<='Z') {
				c=(char)(c+32);
			}
			res+=c;
		}
		return res;
	}
	public static boolean compareStrings(String userLower,String builtIn) {
		for(int i=0;i<userLower.length();i++) {
			if(userLower.charAt(i)!=builtIn.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String s = sc.nextLine();
		String userLower = convertToLowerCase(s);
		String builtIn = s.toLowerCase();
		
		System.out.println("User-defined uppercase: " + userLower);
        System.out.println("Built-in uppercase: " + builtIn);
        System.out.println("Are both equal? " + compareStrings(userLower, builtIn));
		
	}
}
