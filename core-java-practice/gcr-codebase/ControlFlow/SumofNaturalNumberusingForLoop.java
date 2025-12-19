package ControlFlow;

import java.util.Scanner;

public class SumofNaturalNumberusingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){  
            int sumByLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumByLoop += i;
            }
            int sumByFormula = n * (n + 1) / 2;
            if (sumByLoop==sumByFormula) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("Not a natural number");
        }

    }
}
