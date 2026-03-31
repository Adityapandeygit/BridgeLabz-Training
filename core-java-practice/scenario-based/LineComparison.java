package senerio_based;

import java.util.Scanner;

public class LineComparison {
	public static double calculateLineLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
	
	public static boolean checkEquality(double length1,double length2) {
		return length1 == length2;
	}
	
	public static void checkComparision(double length1,double length2) {
		if(length1>length2) {
			System.out.println("Line 1 is greater than line 2");
		}
		else if(length2>length1) {
			System.out.println("Line 2 is greater than line 1");
		}
		else {
			System.out.println("Both the line are equal ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation");
		
		System.out.println("Enter coordinates of starting point x1 and y1 of line 1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter coordinates of ending point x2 and y2 of line 1:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        // Use case-1
        double length1 = calculateLineLength(x1, y1, x2, y2);
       
        
        System.out.println("Enter coordinates of starting point x1 and y1 of line 1:");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Enter coordinates of ending point x2 and y2 of line 1:");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        double length2 = calculateLineLength(a1, b1, a2, b2);
        
        // Use case - 2
        boolean equal = checkEquality(length1,length2);
        if(equal) {
        	System.out.println("The lines are equal");
        }
        else {
        	System.out.println("The lines are not equal");
        }
        
        // Use case - 3
        checkComparision(length1,length2);
        
	}
}
