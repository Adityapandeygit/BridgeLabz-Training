package methods;

import java.util.Scanner;

public class UnitConverter1 {
	public static double km2miles(double dis) {
		return dis*0.621371;
	}
	public static double miles2km(double miles) {
		return miles*1.60934;
	}
	public static double meter2feet(double meters) {
		return meters*3.28084;
	}
	public static double feets2meters(double feet) {
		return feet*0.3048;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in kilometer");
		double dis = sc.nextDouble();
		System.out.println("Kilometers to miles :"+ km2miles(dis));
		
		double miles = km2miles(dis);
		System.out.println("miles to kilometers :"+ miles2km(miles));

		double meter = dis*1000;
		System.out.println("meter to feets :"+ meter2feet(meter));
		
		double feet  = meter2feet(meter);
		System.out.println("feets to meters"+feets2meters(feet));
	}
}
