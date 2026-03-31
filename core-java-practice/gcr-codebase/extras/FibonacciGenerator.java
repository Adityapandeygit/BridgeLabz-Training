package extras;

import java.util.Scanner;

public class FibonacciGenerator {
	public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence are : ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        generateFibonacci(terms);
	}
}
