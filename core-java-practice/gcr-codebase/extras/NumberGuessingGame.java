package extras;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int attempts = 0;
        System.out.println("Think of a number between 1 and 100");
        System.out.println("I will try to guess it!");
        while (low <= high) {
            int guess = (low + high)/2;   
            attempts++;
            System.out.println("\nMy guess is: " + guess);
            System.out.print("Is it High (H), Low (L), or Correct (C)? ");
            char feedback = sc.next().toUpperCase().charAt(0);

            if (feedback == 'H') {
                high = guess - 1;
            } 
            else if (feedback == 'L') {
                low = guess + 1;
            } 
            else if (feedback == 'C') {
                System.out.println("I guessed your number correctly!");
                System.out.println("Total attempts: " + attempts);
                break;
            } 
            else {
                System.out.println("Invalid input. Please enter H, L, or C.");
                attempts--; 
            }
        }
    }
}
