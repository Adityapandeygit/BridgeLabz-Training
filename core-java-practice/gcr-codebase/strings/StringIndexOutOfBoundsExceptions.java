package strings;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptions {
	public static void generateException(String s){
		System.out.println(s.charAt(s.length()));
	}
	
	public static void handleException(String s){
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        catch (RuntimeException e) {
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
			System.out.println("Exception occured in generateException method"+e.getMessage());
		}
		
		handleException(s);
	}

	
}
