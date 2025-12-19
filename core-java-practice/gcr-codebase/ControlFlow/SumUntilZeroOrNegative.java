package ControlFlow;
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n <= 0) {
                break;
            }
            sum += n;
        }

        System.out.println("Sum" + sum);
    }
}
