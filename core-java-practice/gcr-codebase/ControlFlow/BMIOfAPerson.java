package ControlFlow;

import java.util.Scanner;

public class BMIOfAPerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double wt = sc.nextDouble();
		double ht = sc.nextDouble();
		ht = ht/100;
		double bmi = wt/(ht*ht);
		if(bmi<18.4) {
			System.out.println("Underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("Normal");
		}
		else if(bmi>=25.0 && bmi<=39.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}
}
