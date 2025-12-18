import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        float time =sc.nextFloat();
        double SimpleInterest=(principal*rate*time)/100;
        System.out.print(SimpleInterest);

    }
}
