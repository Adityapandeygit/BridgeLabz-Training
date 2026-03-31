package senerio_based;

import java.util.Scanner;

public class MayaBMICalculate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("    Maya BMI Calculator");
		
		System.out.println("Enter the weight in kg ");
		double wt = sc.nextDouble();
		System.out.println("Enter the height in meters");
		double ht = sc.nextDouble();
		
		double bmi = wt/(ht*ht);
		
		System.out.println("Your BMI value is: " + bmi);
		
		
		if(bmi<18.4) {
			System.out.println("BMI Category : Underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("BMI Category : Normal");
		}
		else if(bmi>=25.0 && bmi<=39.9) {
			System.out.println("BMI Category : Overweight");
		}
		else {
			System.out.println("BMI Category : Obese");
		}
		
		System.out.println("Thank you for using BMI Calculator");
	}
}
