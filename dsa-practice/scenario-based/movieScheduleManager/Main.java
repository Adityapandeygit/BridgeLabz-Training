package dsa_practice.scenario_based.movieScheduleManager;

public class Main {
	public static void main(String[] args) {
		CenimaManager cm = new CenimaManager();
		try {
			cm.addMovie("Dhurandar", "15:00");
			cm.addMovie("Inception", "18:30");
	        cm.addMovie("Interstellar", "21:00");
	        cm.addMovie("Avatar", "25:99");
		}
		catch(InvalidTimeFormatException e) {
			System.out.println(e.getMessage());
		}
		
		cm.displayAllMovies();
        cm.searchMovie("Inter");
        cm.generateReport();
	}
	
}
