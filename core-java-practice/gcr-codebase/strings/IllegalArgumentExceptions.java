package strings;

import java.util.Scanner;

public class IllegalArgumentExceptions {
	public static void generateException(String s){
		String s1 = s.substring(0,s.length()+1);
		System.out.println(s1);
	}
	
	public static void handleException(String s){
        try {
            System.out.println(s.substring(0,s.length()+1));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			generateException(s);
		}
		catch(Exception e){
			System.out.println("Exception occurred in main method"+e.getMessage());
		}
		
		handleException(s);
	}

}
