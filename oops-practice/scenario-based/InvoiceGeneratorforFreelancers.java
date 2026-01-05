package oops_practice.scanrio_based;

import java.util.Scanner;
class InvalidInvoiceFormatException extends Exception {
    public InvalidInvoiceFormatException(String message) {
        super(message);
    }
}

public class InvoiceGeneratorforFreelancers {
	public static String[] parseInvoice(String s) {
		String[] splitarr = s.split(",");
		return splitarr;
	}
	
	public static int GetTotalAmount(String[] parse) {
		int total = 0;
		
		for(String s : parse) {
			String[] parts = s.trim().split(" - ");
			String amount  = parts[1].replace("INR","").trim();
			total+=Integer.parseInt(amount);
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the invoice details :  ");
		String input = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Invoice details : ");
		
		String[] parse = parseInvoice(input);
		for(String s :parse) {
			System.out.println(s.trim());
		}
		System.out.println();
		int totalPrice = GetTotalAmount(parse);
		System.out.println("Total Amount : "+totalPrice);
		
	}
}
