package m1.oceanFleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VesselUtil vu = new VesselUtil();
		System.out.println("Enter the number of vessels to be added");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] arr = s.split(":");
			vu.addVesselPerformance(new Vessel(arr[0],arr[1],Double.parseDouble(arr[2]),arr[3]));
		}
		System.out.println("Enter the Vessel Id to check speed");
		String s = sc.next();
		System.out.println(vu.getVesselById(s));
		
		System.out.println("High performance vessels are");
		List<Vessel> ans = vu.getHighPerformanceVessels();
		for(Vessel v : ans) {
			System.out.println(v);
		}
	}
}
