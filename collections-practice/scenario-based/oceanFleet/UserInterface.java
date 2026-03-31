package collections_practice.scenario_based.oceanFleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VesselUtil  vu = new VesselUtil();
		
		System.out.println("Number of vessels user want to add : ");
		int n = sc.nextInt();
		sc.nextLine();

		for(int i=0;i<n;i++) {
		    System.out.println("Enter the vessel performance ");
		    String input = sc.nextLine();   
		    String[] arr = input.split(":");

		    String vesselId = arr[0];
		    String vesselName = arr[1];
		    double averageSpeed = Double.parseDouble(arr[2]);
		    String vesselType = arr[3];

		    vu.addVesselPerformance(new Vessel(vesselId,vesselName,averageSpeed,vesselType));
		}

		System.out.println("Enter the vessel id to found");
		String s = sc.nextLine();

		if(vu.getVesselById(s) != null) {
		    Vessel outputVessle = vu.getVesselById(s);

		    System.out.println(
		        outputVessle.getVesselId() + "|" +
		        outputVessle.getVesselName() + "|" +
		        outputVessle.getVesselType() + "|" +
		        outputVessle.getAverageSpeed() + " knots"
		    );
		}
		else {
		    System.out.println(s + " not found ");
		}

		System.out.println("High Performance Vehicles are:");
		List<Vessel> hpv = vu.getHighPerformanceVessel();
		for(Vessel v : hpv) {
		    System.out.println(
		        v.getVesselId() + "|" +
		        v.getVesselName() + "|" +
		        v.getVesselType() + "|" +
		        v.getAverageSpeed()+"knots"
		    );
		}
	}
}
