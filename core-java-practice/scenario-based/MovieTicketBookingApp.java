package senerio_based;

import java.util.Scanner;

public class MovieTicketBookingApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char continueBooking = 'y';
		while(continueBooking=='Y' || continueBooking=='y') {
			int ticketPrice =0;
			int snacksPrice =0;
			System.out.println("Enter the type of Movie");
			System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            int choice = sc.nextInt();
            
            switch(choice) {
            case 1:
            	ticketPrice = 200;
                break;
            case 2:
            	ticketPrice = 300;
                break;
            case 3:
            	ticketPrice = 400;
                break;
            default:
                System.out.println("Invalid movie choice!");
                continue;    
            }
            
            System.out.print("Enter Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }
            
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("yes")) {
                snacksPrice = 80;
            }
            
            int totalAmount = ticketPrice + snacksPrice;
            System.out.println("Booking Summary");
            System.out.println("Ticket Price: ₹" + ticketPrice);
            System.out.println("Snacks Price: ₹" + snacksPrice);
            System.out.println("Total Amount: ₹" + totalAmount);

            System.out.print("\nBook ticket for another customer? (y/n): ");
            continueBooking = sc.next().charAt(0);
            
		}
	}
}
