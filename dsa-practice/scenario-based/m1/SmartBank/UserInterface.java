package m1.SmartBank;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter employment type: ");
            String employmentType = sc.nextLine();

            System.out.print("Enter monthly income: ");
            double monthlyIncome = sc.nextDouble();

            System.out.print("Enter existing credit dues: ");
            double dues = sc.nextDouble();

            System.out.print("Enter credit score: ");
            int creditScore = sc.nextInt();

            System.out.print("Enter number of loan defaults: ");
            int defaults = sc.nextInt();

            // Validate
            CreditRiskProcessor.validateCustomerDetails(age, employmentType,
                    monthlyIncome, dues, creditScore, defaults);

            // Calculate Credit Limit
            double creditLimit = CreditRiskProcessor.calculateCreditLimit(
                    monthlyIncome, dues, creditScore, defaults);

            System.out.println("Customer Name: " + name);
            System.out.println("Approved Credit Limit: ₹" + (int) creditLimit);

        } catch (InvalidCreditDataException e) {
            System.out.println(e.getMessage());
        }

	}
}
