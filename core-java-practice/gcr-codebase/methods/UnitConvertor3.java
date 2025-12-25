package methods;

import java.util.Scanner;

public class UnitConvertor3 {
	public static double convertFarhenheitToCelsius(double farhenheit) {
		return (farhenheit - 32) * 5 / 9;    
    }
    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
    	return (celsius * 9 / 5) + 32; 
    }
    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
    	return pounds*0.453592;     
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
    	return kilograms*2.20462;
    }
    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons*3.78541; 
    }
    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters*0.264172;
    }
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit:");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + convertFarhenheitToCelsius(f));
        System.out.println("\nEnter temperature in Celsius:");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFarhenheit(c));

        System.out.println("\nEnter weight in Pounds:");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " +convertPoundsToKilograms(pounds));

        System.out.println("\nEnter weight in Kilograms:");
        double kg = sc.nextDouble();
        System.out.println("Pounds: " +convertKilogramsToPounds(kg));

        System.out.println("\nEnter volume in Gallons:");
        double gallons = sc.nextDouble();
        System.out.println("Liters: " +convertGallonsToLiters(gallons));

        System.out.println("\nEnter volume in Liters:");
        double liters = sc.nextDouble();
        System.out.println("Gallons: " +convertLitersToGallons(liters));

	}
}
