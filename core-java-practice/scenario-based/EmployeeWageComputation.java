package senerio_based;

import java.util.Scanner;

public class EmployeeWageComputation {
	public static boolean checkEmployeeAttendance() {
		int attendance = (int)(Math.random() * 2); 
		return attendance==1;
	}
	
	public static int EmployeeDailyWages() {
		int wage_per_hour = 20;
		int full_day_hour = 8;
		return wage_per_hour*full_day_hour;
	}
	
	public static void partTimeEmployeeAndWages() {
		int wage_per_hour = 20;
        int part_time_hour = 8;
		int attendance = (int)(Math.random() * 3);
		if(attendance==3) {
			System.out.println("Part time Employee");
			int partTimeWage = wage_per_hour * part_time_hour;
			System.out.println("Part Time Wage : " + partTimeWage);
			
		}
		else if (attendance==1) {
            System.out.println("Employee is Full Time");
        } 
        else {
            System.out.println("Employee is Absent");
        }
	}
	
	public static void partTimeEmployeeAndWagesusingSwitchCase() {
		int wage_per_hour = 20;
	    int full_time_hour = 8;
	    int part_time_hour = 8;
	    int empType = (int)(Math.random() * 3); // 0,1,2

	    switch (empType) {
	        case 1:
	            int fullTimeWage = wage_per_hour * full_time_hour;
	            System.out.println("Employee is Full Time");
	            System.out.println("Full Time Wage : " + fullTimeWage);
	            break;

	        case 2:
	            int partTimeWage = wage_per_hour * part_time_hour;
	            System.out.println("Employee is Part Time");
	            System.out.println("Part Time Wage : " + partTimeWage);
	            break;

	        default:
	            System.out.println("Employee is Absent");
	    }
	}
	
	public static void MonthlyWages() {
		int working_days = 20;
		int full_time_hour = 8;
		int wage_per_hour = 20;
		System.out.println("Monthly wages of employee :"+working_days*full_time_hour*wage_per_hour);
		
	}
	
	public static void calculateMonthlyWageWithCondition() {
		int wagePerHour = 20;
	    int fullTimeHour = 8;
	    int partTimeHour = 8;

	    int totalWorkingHours = 0;
	    int totalWorkingDays = 0;
	    int totalWage = 0;
	    final int max_hours = 100;
	    final int max_days = 20;

	    while (totalWorkingHours<max_hours && totalWorkingDays<max_days) {
	        totalWorkingDays++;
	        int empType = (int)(Math.random() * 3); 
	        int empHours = 0;
	        switch (empType) {
	            case 1:
	                empHours = fullTimeHour;
	                break;
	            case 2:
	                empHours = partTimeHour;
	                break;
	            default:
	                empHours = 0;
	        }

	        totalWorkingHours += empHours;
	        totalWage += empHours * wagePerHour;
	    }
	    System.out.println("Total Working Days : " + totalWorkingDays);
	    System.out.println("Total Working Hours : " + totalWorkingHours);
	    System.out.println("Total Monthly Wage : " + totalWage);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program");
		// Use case-1
		boolean check = checkEmployeeAttendance();
		if(check) {
			System.out.println("Emplowee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
		
		// Use case-2
		int dailyWages = EmployeeDailyWages();
		System.out.println("Daily Wages of employee : "+ dailyWages);
		
		// Use case-3
		partTimeEmployeeAndWages();
		
		// Use case-4
		partTimeEmployeeAndWagesusingSwitchCase();
		
		// Use case-5
		MonthlyWages();
		
		// Use case-6
		calculateMonthlyWageWithCondition();
	}
	
}
