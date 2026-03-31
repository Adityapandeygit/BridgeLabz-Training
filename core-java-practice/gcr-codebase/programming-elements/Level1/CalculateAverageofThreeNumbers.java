import java.util.Scanner;

public class CalculateAverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        int thirdNumber=sc.nextInt();
        double Average=(firstNumber+secondNumber+thirdNumber)/3;
        System.out.print(Average);
    }
}
