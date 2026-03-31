package senerio_based;

import java.util.Scanner;

public class CoffeeCounterChronicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Ravi Cafe");
        System.out.print("Enter coffee type: ");
        String coffee_type = sc.next();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int price = 0;
        double gstRate = 0.18; 

        switch (coffee_type) {

            case "Cappuccino":
                price = 20;
                break;

            case "Espresso":
                price = 30;
                break;

            case "Latte":
                price = 40;
                break;

            case "Americano":
                price = 50;
                break;

            case "Mocha":
                price = 60;
                break;

            default:
                System.out.println("Invalid coffee type!");
                return;
        }
        int baseAmount = price * quantity;
        double gstAmount = baseAmount * gstRate;
        double totalAmount = baseAmount + gstAmount;

        System.out.println("Base Amount : ₹" +baseAmount);
        System.out.println("GST (18%)   : ₹" +gstAmount);
        System.out.println("Total Bill  : ₹" +totalAmount);
    }
}
