package ControlFlow;

import java.util.Scanner;

public class SumOfNumberUntilZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			int n = sc.nextInt();
			if(n==0 ||n<0) {
				break;
			}
			else {
				sum+=n;
			}
		}
		System.out.println(sum);
	}
}
