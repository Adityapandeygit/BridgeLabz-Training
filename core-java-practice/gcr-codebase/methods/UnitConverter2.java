package methods;

import java.util.Scanner;

public class UnitConverter2 {
	public static double yards2feet (double yards) {
		return yards*3;
	}
	
	public static double feet2yards(double feet) {
		return feet*0.333333;
	}
	
	public static double meters2inches(double meters) {
		return meters*39.3701;
	}
	
	public static double inches2meters(double inch) {
		return inch*0.0254;
	}
	
	public static double inches2cm(double inch) {
		return inch*25.4;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in yard");
		double yards = sc.nextDouble();
		
		System.out.println("Yards to feet :"+ yards2feet(yards));
				
		double feet = yards2feet(yards);
		System.out.println("Feets to yards :"+ feet2yards(feet));
		
		double meter = yards*0.9144;
		System.out.println("Meter to inches :"+ meters2inches(meter));
		
		double inch  = meters2inches(meter);
		System.out.println("Inches to meters"+inches2meters(inch));
		System.out.println("Inches to centimeters"+inches2cm(inch));
		
	}
}
