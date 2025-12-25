package methods;

import java.util.Scanner;

public class DistanceAndLineEquation {
	public static double findDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        return distance;
    }
    // Method to find slope (m) and y-intercept (b)
    // Returns array: index 0 -> slope (m), index 1 -> y-intercept (b)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        double m = (y2 - y1) / (x2 - x1);  // slope
        double b = y1 - m * x1;            // y-intercept
        result[0] = m;
        result[1] = b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter x2 and y2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.printf("\nEuclidean Distance between points: %.2f\n", distance);
        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", line[0], line[1]);

    }
}
