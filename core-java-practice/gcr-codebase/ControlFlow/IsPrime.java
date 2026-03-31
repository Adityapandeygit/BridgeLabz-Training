package ControlFlow;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n==1) {
			System.out.println("false");
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime);
	}
}
