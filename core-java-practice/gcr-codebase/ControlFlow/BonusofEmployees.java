package ControlFlow;

import java.util.Scanner;

public class BonusofEmployees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int service_of_years = sc.nextInt();
		if(service_of_years>5) {
			int bonus_amt = (salary*5)/100;
			System.out.println("Bonus amount : "+ bonus_amt);
		}
		else {
			System.out.println("Experience is less than 5 years");
		}
	}
}
