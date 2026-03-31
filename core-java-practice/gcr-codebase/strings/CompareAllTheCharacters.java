package strings;
import java.util.*;
public class CompareAllTheCharacters {
	
	public static char[] getUserBuildChar(String s) {
		char[] c = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i] = s.charAt(i);
		}
		return c;
	}
	
	public static boolean isCompare(char[] userArray,char[] builinArray) {
		for(int i=0;i<userArray.length;i++) {
			if(userArray[i]!=builinArray[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String s = sc.next();
        
        char[] userArray = getUserBuildChar(s);
        char[] builinArray = s.toCharArray();
        System.out.println(isCompare(userArray,builinArray));

	}

}
