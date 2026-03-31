package dsa_practice.gcr_codebase.stringBuilderandstringBuffer;
import java.util.*; 
public class ReverseStringBuilder {
	public static String reverse(StringBuilder sb) {
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		System.out.println(reverse(sb));;
	}
}
