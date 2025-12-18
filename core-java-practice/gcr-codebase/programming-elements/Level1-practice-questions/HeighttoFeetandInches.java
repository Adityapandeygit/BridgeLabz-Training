package Level_1_Practice_Programs;

import java.util.Scanner;

public class HeighttoFeetandInches {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        double totalInches = height/2.54;
        int feet = (int)(totalInches/12);
        int inches = (int)totalInches % 12;

        System.out.println("Your Height in cm is " + height +" while in feet is " + feet +" and inches is " + inches);
	}
}
