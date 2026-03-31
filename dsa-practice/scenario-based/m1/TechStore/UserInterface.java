package m1.TechStore;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GadgetValidatorUtil gu = new GadgetValidatorUtil();
		
			System.out.println("Enter the number of gadget entries");
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++) {
				try {
				System.out.println("Enter gadget" +(i+1)+"details");
				String s = sc.next();
				String[] arr = s.split(":");
				String gadgetID = arr[0];
				int duration = Integer.parseInt(arr[2]);
				if(gu.validateGadgetID(gadgetID) && gu.validateWarrantyPeriod(duration)) {
					System.out.println("Warranty accepted, stock updated");
				}
				}
				catch(InvalidGadgetException e) {
					System.out.println(e.getMessage());
				}
			}
			
	}
}
