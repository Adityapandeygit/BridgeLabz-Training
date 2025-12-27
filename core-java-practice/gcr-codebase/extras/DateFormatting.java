package extras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in the form : (dd-MM-yyyy)");
		String inputDate = sc.next();
		DateTimeFormatter formate1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(inputDate, formate1);
		System.out.println("Date in the form dd/MM/yyyy " + date);
		
		DateTimeFormatter formate2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date2 = date.format(formate2);
		System.out.println("Date in the form yyyy-MM-dd" + date2);
		
	}
}
