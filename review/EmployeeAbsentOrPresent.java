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
		
		//UC-4
		System.out.println("Enter the employee attendence(0 or 1)");
		int attendence = sc.nextInt();
		
		switch(attendence) {
		case 1:
			System.out.println("Employee is Present");
			calculateDailyEmployeeWage();
			
			System.out.println("Enter the extra hours employee worked");
			int extrahours1 = sc.nextInt();
			addPartTimeWages(extrahours1);
			break;
		case 2:
			System.out.println("Employee is Absent");
			break;
		}
		
		
	}
}
