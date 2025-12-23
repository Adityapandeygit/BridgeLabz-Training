package senerio_based;

import java.util.Scanner;

public class MetroSmartCardFareDeduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the balance of your card");
		double balance = sc.nextDouble();

		if (balance > 0) {
			String choice = "yes";

			while (balance > 0 &&choice.equals("y") || choice.equals("Y") ||
				       choice.equals("yes") ||
				       choice.equals("Yes")) {

				System.out.println("Enter the distance you want to travel");
				int distance = sc.nextInt();

				int fare1 = (distance <= 5) ? 10 : 0;
				int fare2 = (distance > 5 && distance <= 20) ? 25 : 0;
				int fare3 = (distance > 20) ? 40 : 0;

				int fare = fare1 + fare2 + fare3;

				if (balance >= fare) {
					balance = balance - fare;
					System.out.println("Fare deducted: " + fare +
					                   " Available Balance: " + balance);
				} else {
					System.out.println("Insufficient balance for this journey");
					break;
				}

				System.out.print("Do you want to travel again? (y/n): ");
				choice = sc.next();   
				if (choice.equals("n") || choice.equals("N") ||
					    choice.equals("no") || choice.equals("No")) {
					    System.out.println("Thank you for using Metro Smart Card!");
					    break;
					}
			}
		} else {
			System.out.println("Insufficient Balance. Please Recharge");
		}

		sc.close();
	}
}
