package ControlFlow;

import java.util.Scanner;

public class CheckNaturalNumber_and_SumofnNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number  = sc.nextInt();
		if(number<1) {
			System.out.println("The number "+number+" is not a natural number");
		}
		else {
			System.out.println("The sum of "+number+" natural numbers is "+(number*(number+1)/2));
		}
	}
}
