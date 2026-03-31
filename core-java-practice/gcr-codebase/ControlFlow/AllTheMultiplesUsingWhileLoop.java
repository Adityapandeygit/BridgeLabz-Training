package ControlFlow;

import java.util.Scanner;

public class AllTheMultiplesUsingWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0 && n<100) {
			int counter=1;
			while(counter<n-1) {
				if(n%counter==0) {
					System.out.println(counter);
				}
				counter++;
			}
		}
		else {
			System.out.println("Number is out of range");
		}
	}
}
