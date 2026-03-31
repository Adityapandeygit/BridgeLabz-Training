package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class EmployeeNameUppercase {
	public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Aditya", "Rahul", "Sneha", "Priya");

        List<String> upperNames = employeeNames.stream().map(String::toUpperCase) .toList(); 

        upperNames.forEach(System.out::println);
    }
}
