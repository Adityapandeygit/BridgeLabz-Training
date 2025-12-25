package methods;

import java.util.Scanner;

public class NumberChecker2 {
	public static int digitCount(int number) {
        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) {
        	return 1;
        } 
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public static int[] getDigitsArray(int number) {
        int count = digitCount(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
    // Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }
    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Initialize digits
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        // Count frequency
        for (int d : digits) {
            frequency[d][1]++;
        }

        return frequency;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digitCount = digitCount(number);
        int[] digits = getDigitsArray(number);

        System.out.println("\nDigit Count: " + digitCount);

        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        int sumDigits = sumOfDigits(digits);
        int sumSquares = sumOfSquaresOfDigits(digits);

        System.out.println("\n\nSum of Digits: " + sumDigits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        System.out.println("Harshad Number: " + isHarshadNumber(number, digits));

        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }

    }
}
