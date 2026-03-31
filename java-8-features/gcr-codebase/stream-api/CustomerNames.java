package java_8_features.stream_Api;

import java.util.Arrays;
import java.util.List;

public class CustomerNames {
	public static void main(String[] args) {
		List<String> customers = Arrays.asList(
                "Aditya",
                "Rahul",
                "sneha",
                "Aman",
                "priya"
        );
		customers.stream().map(name -> name.toUpperCase()).sorted()
		.forEach(System.out::println);
	}
}
