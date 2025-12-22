package strings;

import java.util.Scanner;

public class LengthOfAString {
	public static int countLength(String s) {
		int count = 0;
		try {
            while (true) {   
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurs");
        }

        return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		
		System.out.println("User built method: " + countLength(s));
		System.out.println("builtin method: " + s.length());
	}
}
