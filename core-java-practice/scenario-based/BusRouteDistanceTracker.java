package senerio_based;

import java.util.Scanner;

public class BusRouteDistanceTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totaldis = 0;
		String choice;
		while(true) {
			totaldis +=5;
			System.out.println("Bus reached to a stop");
			System.out.println("Distance covered so far is :"+totaldis);
			System.out.print("Do you want to get off the bus? (yes/no): ");
			choice = sc.next();
			if(choice.equals("yes")){
				System.out.println("You got off the bus.");
                break;
			}
		}
		System.out.println("Total distance traveled: " + totaldis + " kms");
	}
}
