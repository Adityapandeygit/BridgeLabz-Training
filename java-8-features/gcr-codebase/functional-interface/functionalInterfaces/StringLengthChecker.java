package java_8_features.functionalInterface.functionalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter message: ");
        String message = sc.nextLine();

        System.out.print("Enter character limit: ");
        int limit = sc.nextInt();
		Function<String,Integer> lengthFunction = new Function<String,Integer>(){
			public Integer apply(String msg) {
				return msg.length();
			}
		};
		if(lengthFunction.apply(message)>limit) {
			System.out.println("Message exceeds character limit!");
		}
		else {
			System.out.println("Message is within limit.");
		}
	}
}
