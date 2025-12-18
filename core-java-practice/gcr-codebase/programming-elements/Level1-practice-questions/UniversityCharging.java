package Level_1_Practice_Programs;

public class UniversityCharging {
	public static void main(String[] args) {
		int fee = 125000;
		int discountPercent = 10;
		double discount = (125000*10)/100;
		System.out.println("The discount amount is INR "+discount+" and discounted fee is INR "+(fee-discount));
	}
}
