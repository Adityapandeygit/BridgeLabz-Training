package ControlFlow;

import java.util.Scanner;

public class FactorOfANumberusingWhileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0) {
			int counter=1;
			while(counter<=n) {
				if(n%counter==0) {
					System.out.println(counter);
				}
				counter++;
			}
		}
		else{
			System.out.println("Number is negative");
		}
	}
}
