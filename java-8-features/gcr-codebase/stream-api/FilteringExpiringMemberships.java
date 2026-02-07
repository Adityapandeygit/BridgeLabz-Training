package java_8_features.stream_Api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class FilteringExpiringMemberships {
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>();
		
		members.add(new Member("Aditya", LocalDate.now().plusDays(10)));
		members.add(new Member("Rahul", LocalDate.now().plusDays(40)));
		members.add(new Member("Sneha", LocalDate.now().plusDays(25)));
		members.add(new Member("Aman", LocalDate.now().plusDays(5)));
		members.add(new Member("Priya", LocalDate.now().plusDays(60)));
		LocalDate today = LocalDate.now();
		LocalDate next30Days = today.plusDays(30);
		members.stream()
		.filter(member -> 
		        !member.expiryDate.isBefore(today) &&
		        !member.expiryDate.isAfter(next30Days))
		.forEach(member -> 
		        System.out.println(member.name + " Expiry: " + member.expiryDate));
	}
}
