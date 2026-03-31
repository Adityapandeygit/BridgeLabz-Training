package methods;

import java.util.Scanner;

public class NumberChecking {
	public static boolean isPositive(int number) {
        return number >= 0;
    }
	
	public static boolean isEven(int number) {
        return number % 2 == 0;
    }
	
	public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers :");
        for (int i = 0; i < numbers.length; i++) {
        	
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("\nComparison of first and last elements:");
        if (result == 1) {
            System.out.println("First element is Greater than Last element");
        } else if (result == 0) {
            System.out.println("First element is Equal to Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }

    }
}
