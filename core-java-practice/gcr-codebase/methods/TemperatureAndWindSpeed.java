package methods;

import java.util.Scanner;
import java.lang.Math;
public class TemperatureAndWindSpeed {
	public static double calculateWindChill(double temp, double windSpeed) {
		return  35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed, 0.16); 

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature :");
		double temperature = sc.nextDouble();
		System.out.println("Enter the windspeed :");
		double windspeed = sc.nextDouble();
		
		System.out.println("The windspeed is :"+ calculateWindChill(temperature, windspeed));
	}
}
