package java_8_features.stream_Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Doctor {
    String name;
    String specialty;
    List<String> availableDays;

    Doctor(String name, String specialty, List<String> availableDays) {
        this.name = name;
        this.specialty = specialty;
        this.availableDays = availableDays;
    }
}

public class HospitalDoctorAvailability {
	public static void main(String[] args) {
		List<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor("Dr. Sharma", "Cardiologist", Arrays.asList("Monday", "Saturday")));
		doctors.add(new Doctor("Dr. Mehta", "Dermatologist", Arrays.asList("Sunday")));
		doctors.add(new Doctor("Dr. Khan", "Neurologist", Arrays.asList("Friday", "Saturday")));
		doctors.add(new Doctor("Dr. Singh", "Orthopedic", Arrays.asList("Wednesday")));
		doctors.add(new Doctor("Dr. Patel", "Pediatrician", Arrays.asList("Sunday", "Saturday")));
		
		doctors.stream().filter(doc -> doc.availableDays.contains("Saturday")|| 
				doc.availableDays.contains("Sunday"))
				.sorted(Comparator.comparing(doc -> doc.specialty)).forEach(doc -> System.out.println(doc.name + " - " + doc.specialty));
	}
}
