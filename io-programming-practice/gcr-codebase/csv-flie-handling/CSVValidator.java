package io_programing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class CSVValidator {
	static final String email_regex ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    static final String phone_regex = "^\\d{10}$";
    public static void main(String[] args) {
        String filePath = "employees.csv";
        Pattern emailPattern = Pattern.compile(email_regex);
        Pattern phonePattern = Pattern.compile(phone_regex);
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int rowNumber = 0;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                rowNumber++;
                String[] data = line.split(",");
                String email = data[2];
                String phone = data[3];

                boolean emailValid =emailPattern.matcher(email).matches();
                boolean phoneValid =phonePattern.matcher(phone).matches();
                if (!emailValid || !phoneValid) {
                    System.out.println("Invalid Row at line "+ rowNumber + ": " + line);
                    if (!emailValid)
                        System.out.println("   → Invalid Email Format");
                    if (!phoneValid)
                        System.out.println("   → Phone must be 10 digits");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
