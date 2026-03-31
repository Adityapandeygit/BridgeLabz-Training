package Level_1_Practice_Programs;
import java.util.Scanner;
public class AreaofTraingle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double area = (base*height)*0.5;
		System.out.println("Area of Triangle is "+area);
	}
}
