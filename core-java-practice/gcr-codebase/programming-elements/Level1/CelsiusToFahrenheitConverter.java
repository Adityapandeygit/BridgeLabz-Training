import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.println("In Fahrenheit: " + toFahrenheit(temp));

    }
}
