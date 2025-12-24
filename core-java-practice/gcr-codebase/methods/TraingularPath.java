package methods;

import java.util.Scanner;
import java.lang.Math;

public class TraingularPath {
	
	public static int no_of_rounds(int perimeter) {
		return perimeter/5;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of a triangle :");
		double s1 =sc.nextDouble();
		double s2 =sc.nextDouble();
		double s3 =sc.nextDouble();
		
		int perimeter = (int)Math.round((s1+s2+s3));
		System.out.println("Number of rounds to complete 5km are :"+no_of_rounds(perimeter));
		
	}
}
