package java_8_features.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
class Alert {
    String message;
    String type;
    public Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}
public class HospitalNotification {
	public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("Take your medicine at 8 AM", "Medication"));
        alerts.add(new Alert("Doctor appointment at 3 PM", "Appointment"));
        alerts.add(new Alert("Blood pressure critical!", "Emergency"));
        alerts.add(new Alert("Take your medicine at 8 PM", "Medication"));

        Predicate<Alert> medicationFilter = alert -> alert.type.equals("Medication");

        Predicate<Alert> emergencyFilter = alert -> alert.type.equals("Emergency");

        System.out.println("Medication Alerts:");
        alerts.stream()
              .filter(medicationFilter)
              .forEach(System.out::println);

        System.out.println("\nEmergency Alerts:");
        alerts.stream()
              .filter(emergencyFilter)
              .forEach(System.out::println);
    }
}
