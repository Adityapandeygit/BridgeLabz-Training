package m1.SoundSphere;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EarphoneUtil eu = new EarphoneUtil();
		List<Earphone> l = new ArrayList<>();
		System.out.println("Enter the number of earphones");
		int n = sc.nextInt();
		System.out.println("Enter the earphone details");
		for(int i=0;i<n;i++) {
			
			String s = sc.next();
			String[] arr = s.split(":");
			String brand = arr[0];
			LocalDate release = LocalDate.parse(arr[1]);
			double price = Double.parseDouble(arr[2]);
			double rating = Double.parseDouble(arr[3]);
			l.add(new Earphone(brand,release,price,rating));
			
		}
		System.out.println("Enter the brand name");
		String str = sc.next();
		
		List<Earphone> ans= eu.getEarphonesByBrandName(l.stream(), str).toList();
		if(ans.isEmpty()) {
			System.out.println("No earphones found for the brand LG");
			
		}
		else {
			for(Earphone e : ans) {
				System.out.println("Earphones by brand Panasonic are");
				System.out.println(e.getBrandName()+" | "+e.releaseDate +" | "+ e.price+" | "+ e.rating);
			}
		}
		
		System.out.println("Enter the minimum and maximum price range");
		double min  = sc.nextDouble();
		double max  = sc.nextDouble();
		List<Earphone> ans1 = eu.getEarphonesWithinPriceRange(l.stream(), min, max);
		if(ans.isEmpty()) {
			System.out.println("No earphones found within the price range "+min+" to "+max);
		}
		for(Earphone e : ans1) {
			System.out.println(e.getBrandName()+" | "+e.releaseDate +" | "+ e.price+" | "+ e.rating);
		}
		
		
	}
}
