package methods;

import java.util.Scanner;

public class FactorsOperations {
	public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1;i<=num;i++) {
            if (num % i==0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i=1;i<=num;i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.println("Factors of the given number are :");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));
    }

}
