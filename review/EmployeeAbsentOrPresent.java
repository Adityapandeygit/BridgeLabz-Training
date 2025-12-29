package review;

import java.util.Scanner;
import java.util.Random;

public class EmployeeAbsentOrPresent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the attendence of employee (0 or 1)");
		Random random = new Random();
        int attendance = random.nextInt(2);
		if(attendance==1) {
			System.out.println("Employee is present today");
		}
		else {
			System.out.println("Employee is absent "); 
		}
	}
}
