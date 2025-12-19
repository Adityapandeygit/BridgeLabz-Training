package ControlFlow;

import java.util.Scanner;

public class SumofNaturalNumberusingWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			
			if(sum==(n*(n+1)/2)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		else {
			System.out.println("Not a natural number");
		}
		
	}
}
