package methods;

import java.util.Scanner;

public class ReminderAndQuotient {
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient  = number/divisor;
		int reminder = number%quotient;
		return new int[] {quotient,reminder};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		System.out.println("Enter the didvisor");
		int divisor = sc.nextInt();
		
		System.out.println();
		int[] ans = findRemainderAndQuotient(number,divisor);
	}
}
