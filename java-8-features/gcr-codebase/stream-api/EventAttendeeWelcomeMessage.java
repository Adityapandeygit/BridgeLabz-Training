package java_8_features.stream_Api;

import java.util.Arrays;
import java.util.List;

public class EventAttendeeWelcomeMessage {
	public static void main(String[] args) {
		List<String> attendees = Arrays.asList(
			    "Aditya",
			    "Rahul",
			    "Priya",
			    "Sneha",
			    "Amit"
			);
		
		attendees.forEach(name -> 
        System.out.println("Welcome " + name + " to the event!"));
	}
}
