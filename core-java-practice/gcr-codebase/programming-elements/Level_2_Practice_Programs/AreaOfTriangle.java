package Level_2_Practice_Programs;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double area = (base*height)*0.5;
		
		double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;
        double areaSqIn = 0.5 * baseInInches * heightInInches;
		System.out.println("The Area of the triangle in sq in is "+areaSqIn+" and sq cm is "+area);
	}
}
