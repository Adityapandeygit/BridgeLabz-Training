package java_8_features.functionalInterface.staticMethodsinInterfaces;

import java.util.Scanner;

interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}
public class UnitConversionTool {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kilometers");
		double km = sc.nextDouble();
		System.out.println("kmToMiles : " + UnitConverter.kmToMiles(km));
		System.out.println("kgToLbs : " + UnitConverter.kgToLbs(km));
	}
}
