package strings;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptions {
	
	public static void generateException(String[] names) {
		System.out.println(names[6]);
	}
	
	public static void handleException(String[] names) {
		try {
			System.out.println(names[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		for(int i=0;i<names.length;i++) {
			names[i] = sc.next();
		}
		try {
			generateException(names);
		}
		catch(Exception e){
			System.out.println("Exception occured in generateException method"+e.getMessage());
		}
		
		handleException(names);
	}
}
