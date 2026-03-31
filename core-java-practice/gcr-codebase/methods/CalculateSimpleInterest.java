package methods;

import java.util.Scanner;

public class CalculateSimpleInterest {
	public static double calSimpleInterest(double principle,double rate,double time) {
		return (principle*rate*time)/100;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle: ");
		double principle = sc.nextDouble();
		
		System.out.println("Enter rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter time in years: ");
		double time = sc.nextDouble();
		
		System.out.println("The Simple Interest is: "+calSimpleInterest(principle,rate,time)+
				" for Principal: "+principle+", Rate of Interest: "+rate+"and Time: "+time);
	}
}
