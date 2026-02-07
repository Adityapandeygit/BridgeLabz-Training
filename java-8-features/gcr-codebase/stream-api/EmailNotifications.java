package java_8_features.stream_Api;

import java.util.Arrays;
import java.util.List;

public class EmailNotifications {
	public static void main(String[] args) {
		List<String> emails = Arrays.asList(
			    "adi@gmail.com",
			    "rahul@gmail.com",
			    "priya@gmail.com"
			);
		emails.forEach(email -> sendEmailNotification(email));
	}
	static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}	
