package review.SmartEnergyConsuptionMonitor;

import java.util.Scanner;

public class Menu {
	SmartEnergyMonitor monitor = new SmartEnergyMonitor();
	public void start() throws InvalidEnergyReadingException {
		System.out.println("1 . To add date wise consuption");
		System.out.println("2 . To calculate day wise average energy consuption ");
		System.out.println("3 . To calculate monthly energy consuption ");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the choice :");
			int choice =sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("Enter date (dd/mm/yyyy) and energy consuption");
				String date = sc.next();
				double energy = sc.nextDouble();
				monitor.addReading(date, energy);
				break;
				
			case 2 : 
				String date1 = sc.next();
				System.out.println("Your daily average consuption is : "+monitor.getDailyAverage(date1));
				break;
				
			case 3 :
				System.out.println("Your total consuption is : "+monitor.getMonthlyAverage());
				break;
			}
			
				System.out.println("You have enter an invalid choice");
			
		}
	}
}
