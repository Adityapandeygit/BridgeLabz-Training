package ControlFlow;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original=n;
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum+=rem*rem*rem;
			n/=10;
		}
		if(sum==original) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}
