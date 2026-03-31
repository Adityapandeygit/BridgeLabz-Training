package dsa_practice.scenario_based.movieScheduleManager;

import java.util.ArrayList;

public class CenimaManager {
	Cenima cenima ;
	ArrayList<String> movieTitles = new ArrayList<>();
	ArrayList<String> cenimaTiming = new ArrayList<>();
	
	public void addMovie(String title, String time) throws InvalidTimeFormatException {
		validateTimings(time);
        movieTitles.add(title);
        cenimaTiming.add(time);
    }
	public void validateTimings(String time) throws InvalidTimeFormatException{
		String[] parts = time.split(":");
		int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        if(hour>23 || minute>59) {
        	throw new InvalidTimeFormatException("Invalid time formate");
        }
	}
	public void searchMovie(String keyword) {
		boolean found = false;
		for (int i=0;i<movieTitles.size();i++) {
            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
            	try {
            		System.out.println("Found: " + movieTitles.get(i) + cenimaTiming.get(i));    
                    found = true;  
            	}
            	catch(IndexOutOfBoundsException  e) {
            		System.out.println("Error in accessing the data");
            	}
                     
            }
        }
		if (!found) {
            System.out.println("No movie found with keyword: " + keyword);
        }
	}
	public void displayAllMovies() {
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println("Movie name : " +movieTitles.get(i) + "Show Time: " + cenimaTiming.get(i));
        }
    }
	
	public void generateReport() {
		String[] titlesArray = new String[movieTitles.size()];
		String[] timesArray = new String[cenimaTiming.size()];
		System.out.println("Printable Movie Report");
		for(int i=0;i<titlesArray.length;i++) {
			System.out.println(titlesArray[i] + " at " + timesArray[i]);
		}
	}
}
