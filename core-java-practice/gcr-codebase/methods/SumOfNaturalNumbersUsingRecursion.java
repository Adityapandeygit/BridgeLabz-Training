package methods;

import java.util.Scanner;

public class SumOfNaturalNumbersUsingRecursion {
	// Recursive method to find sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n==1) {
            return 1;
        }
        return n + sumUsingRecursion(n-1);
    }
    // Method to find sum using formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number");
        }else{
            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);
            System.out.println("Sum using Recursion: " + recursiveSum);
            System.out.println("Sum using Formula: " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Both computations are correct");
            } else {
                System.out.println("Computations are not correct");
            }
        }
    }
}
