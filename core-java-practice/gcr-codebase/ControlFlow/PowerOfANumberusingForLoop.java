package ControlFlow;

import java.util.Scanner;

public class PowerOfANumberusingForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		int power = sc.nextInt();
		for(int i=1;i<=power;i++) {
			result*=n;
		}
		System.out.println(result);
	}
}
