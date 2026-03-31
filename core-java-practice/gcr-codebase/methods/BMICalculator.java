package methods;

import java.util.Scanner;

public class BMICalculator {
	public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];       // in kg
            double heightCm = data[i][1];     // in cm

            // Convert height from cm to meters
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi; // store BMI
        }
    }

    // Method to determine BMI status
    public static String[] BMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);

        String[] status = BMIStatus(data);

        System.out.println("BMI Report:");
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    status[i]);
        }

    }
}
