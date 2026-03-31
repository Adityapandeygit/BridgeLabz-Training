package ControlFlow;

import java.util.Scanner;

public class PowerOfANumberusingWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		int power = sc.nextInt();
		int counter =1;
		while (counter<=power) {
            result*=n;
            counter++;
        }
		
		System.out.println(result);
	}
}
