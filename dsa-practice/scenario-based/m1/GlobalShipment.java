package m1;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.*;
public class GlobalShipment {
	public static boolean vShipmentCode(String s ) {
		String r = "SHIP-[1-9][0-9]{5}";
		if(!s.matches(r)) return false;
		
		String digits = s.substring(5);
        int count = 1;
        for(int i=1;i<digits.length();i++){
            if(digits.charAt(i)==digits.charAt(i-1)){
                count++;
                if(count>3) return false;
            }else{
                count=1;
            }
        }

        return true;
	}
	
	public static boolean vShipmentDate(String s) {
		try {
	        if(!s.matches("20\\d{2}-\\d{2}-\\d{2}")) return false;

	        LocalDate d = LocalDate.parse(s);

	        int y = d.getYear();
	        return y >= 2000 && y <= 2099;

	    } catch(Exception e) {
	        return false;
	    }
	}
	static boolean vMode(String mode) {
        Set<String> modes = new HashSet<>(Arrays.asList(
                "AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT"
        ));
        return modes.contains(mode);
    }
	public static boolean vWeight(String weight) {
        if (!weight.matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?"))
            return false;

        double w = Double.parseDouble(weight);

        return w >= 0 && w <= 999999.99;
    }
	public static boolean vStatus(String status) {
        Set<String> statusSet = new HashSet<>(Arrays.asList(
                "DELIVERED","CANCELLED","IN_TRANSIT"
        ));
        return statusSet.contains(status);
    }

	public static boolean validate(String s) {
		
		String[] arr = s.split("\\|");
		if(arr.length!=5) return false;
		return vShipmentCode(arr[0]) && vShipmentDate(arr[1]) && vMode(arr[2]) && vWeight(arr[3]) && vStatus(arr[4]);
				
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			if(validate(s)) {
				System.out.println("COMPLIANT RECORD");
			}
			else {
				System.out.println("NON-COMPLIANT RECORD");
			}
			
		}
	}
}
