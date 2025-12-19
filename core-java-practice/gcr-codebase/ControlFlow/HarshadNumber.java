package ControlFlow;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original = n;
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
			n/=10;
		}
		if(original%sum==0) {
			System.out.println("The number is Harshad");
		}
		else {
			System.out.println("The number is not Harshad");
		}
	}
}
