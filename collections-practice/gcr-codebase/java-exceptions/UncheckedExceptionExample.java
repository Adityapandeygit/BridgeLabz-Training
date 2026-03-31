package collections_practice.gcr_codebase.java_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int ans = n1/n2;
			System.out.println(ans);
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator cannot be zero " );
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Enter the correct format input " );
			System.out.println(e.getMessage());
		}
	}
}
