package Level_1_Practice_Programs;

import java.util.Scanner;

public class StudentFeeandUniversityDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt();
		int discountPercent = sc.nextInt();
		double discount = (fee*discountPercent)/100;
		System.out.println("The discount amount is INR "+discount +" and final discounted fee is INR "+(fee-discount));
	}
}
