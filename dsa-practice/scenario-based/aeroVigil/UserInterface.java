package dsa_practice.scenario_based.aeroVigil;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		FlightUtil f = new FlightUtil();
		String[] arr = input.split(":");
		String flightNumber = arr[0];
		String flightName = arr[1];
		int passengerCount = Integer.parseInt(arr[2]);
		double currentFuelLevel = Integer.parseInt(arr[3]);
		try {
			if(
			f.validateFlightNumber(flightNumber)&&
			f.validateFlightName(flightName)&&
			f.validatePassengerCount(passengerCount, flightName)) {
				f.calculateFuelToFillTank(flightName, currentFuelLevel);
			}
		}
		catch(InvalidFlightException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
