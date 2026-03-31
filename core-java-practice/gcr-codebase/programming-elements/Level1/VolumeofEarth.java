package Level_1_Practice_Programs;

public class VolumeofEarth {
	public static void main(String[] args) {
		int radius_of_earth = 6378;
		double pi = 3.14;
		double vol_of_earth_km = (4.0/3.0)*pi*radius_of_earth*radius_of_earth*radius_of_earth;
		double vol_of_earth_miles = 0.239913*vol_of_earth_km;
		System.out.println("The volume of earth in cubic kilometers is "+vol_of_earth_km+" and cubic miles is "+vol_of_earth_miles);
	}
}
