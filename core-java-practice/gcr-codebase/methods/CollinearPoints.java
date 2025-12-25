package methods;

import java.util.Scanner;

public class CollinearPoints {
	public static boolean areCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // To avoid division by zero, use cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)
            && (y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1);
               
    }
    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );

        return area == 0;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of Point A (x1 y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates of Point B (x2 y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Enter coordinates of Point C (x3 y3):");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        boolean slopeResult = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("\nUsing Slope Formula:");
        if (slopeResult) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are NOT Collinear");
        }
        System.out.println("\nUsing Area of Triangle Formula:");
        if (areaResult) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are NOT Collinear");
        }

    }
}
