package arrays;

import java.util.Scanner;

public class BMIUsing2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for(int i =0;i<number;i++) {
            System.out.println("\nEnter details for Person " +(i+1));

            do{
                System.out.print("Enter weight ");
                personData[i][0] = sc.nextDouble();
            }
            while(personData[i][0] <= 0);

            do{
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
            }
            while(personData[i][1] <= 0);

            personData[i][2] = personData[i][0] / (personData[i][1]*personData[i][1]);

            if(personData[i][2]<18.5) {
                weightStatus[i] = "Underweight";
            }else if (personData[i][2]<25) {
                weightStatus[i] = "Normal weight";
            }else if (personData[i][2]<30) {
                weightStatus[i] = "Overweight";
            }else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i+1));
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("Height: " + personData[i][1]);
            System.out.println("BMI   : " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
	}
}
