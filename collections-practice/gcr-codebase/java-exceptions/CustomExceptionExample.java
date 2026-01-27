package collections_practice.gcr_codebase.java_exception;

import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
public class CustomExceptionExample {
	
	public static void validateAge(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Age must be greate than or equal to 18");
		}
		else {
			System.out.println("Valid age");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
	}
}
