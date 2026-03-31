package java_8_features.functionalInterface.staticMethodsinInterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

interface DateFormatUtil {
	static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
public class DateFormatUtility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        String pattern = sc.next();
        String formattedDate = DateFormatUtil.formatDate(today, pattern);

        System.out.println("Formatted Date: " + formattedDate);
	}
}
