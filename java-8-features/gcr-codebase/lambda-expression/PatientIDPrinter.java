package java_8_features.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

class Patient {
    String id;
    String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
public class PatientIDPrinter {
	public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("P101", "Aditya"));
        patients.add(new Patient("P102", "Rahul"));
        patients.add(new Patient("P103", "Sneha"));

        patients.stream()
                .map(Patient::getId)     
                .forEach(System.out::println); 
    }
}
