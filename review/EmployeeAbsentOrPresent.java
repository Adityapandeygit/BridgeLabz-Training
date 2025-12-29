package review;

import java.util.Scanner;
import java.util.Random;

public class EmployeeAbsentOrPresent {
	
	public static boolean isEmployeePresent() {
        Random random = new Random();
        int attendance = random.nextInt(2); 
        return attendance == 1;
    }
	
	public static int calculateDailyEmployeeWage() {
	    int wagePerHour = 20;
	    int fullDayHours = 8;
	    boolean attendance = isEmployeePresent();
	    if (attendance) {
	        return wagePerHour * fullDayHours; 
	    } else {
	        return 0; 
	    }
	}
	public static int addPartTimeWages(int extrahours) {
		int parttimewages = 20;
		return extrahours*parttimewages;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// UC-1
		if (isEmployeePresent()) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
		//UC-2
		calculateDailyEmployeeWage();
		//UC-3
		System.out.println("Enter the extra hours employee worked");
		int extrahours = sc.nextInt();
		addPartTimeWages(extrahours);
	}
}
