package java_8_features.functionalInterface.functionalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature value: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter threshold value: ");
        double threshold = sc.nextDouble();
        
		Predicate<Double> temperatureAlert = new Predicate<Double>() {
			public boolean test(Double temp) {
				return temp>threshold;
			}
		};
		if (temperatureAlert.test(temperature)) {
            System.out.println("ALERT: Temperature crossed threshold!");
        } else {
            System.out.println("Temperature is within safe limit.");
        }
	}
}
