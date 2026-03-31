package arrays;

import java.util.*;

public class ZaraEmployeeBonus {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalEmployees = 10;
        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i=0; i<totalEmployees;i++) {
            System.out.println("\nEnter details for Employee " + (i+1));
            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = sc.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Please enter valid salary and years of service.");
                i--;
                continue;
            }

            totalOldSalary += salary[i];
        }

        for (int i=0;i<totalEmployees;i++) {

            if (yearsOfService[i]>5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nZara Bonus Summary ");
        for (int i=0;i<totalEmployees;i++) {
            System.out.println(
                "Employee " + (i + 1) +" Old Salary: " + salary[i] +" Bonus: " + bonus[i] +
                " New Salary: " + newSalary[i]
            );
        }

        System.out.println("\nTotal Old Salary of all Employees: " + totalOldSalary);
        System.out.println("Total Bonus Payout by Zara: " + totalBonus);
        System.out.println("Total New Salary of all Employees: " + totalNewSalary);
        
	}

}
