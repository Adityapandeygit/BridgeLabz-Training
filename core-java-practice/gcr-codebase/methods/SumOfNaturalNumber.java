package methods;

import java.util.Scanner;

public class SumOfNaturalNumber {
	public static int sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number");
		int n = sc.nextInt();
		System.out.println("Sum of natural numbers "+sum(n));;
	}
}
