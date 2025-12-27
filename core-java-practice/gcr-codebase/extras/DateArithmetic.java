package extras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entee the day in the form : (dd-mm-yyyy)");
		String inputDate = sc.next();
		
		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(inputDate, formate);
		
		LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
		LocalDate minusDate = addedDate.minusWeeks(3);
		
		System.out.println("Original Date : " + date);
        System.out.println("After Adding 7 days, 1 month, 2 years : "+ addedDate);
        System.out.println("After Subtracting 3 weeks : "+ minusDate);

	}
}
