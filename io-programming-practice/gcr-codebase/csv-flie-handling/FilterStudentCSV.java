package io_programing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudentCSV {
	public static void main(String[] args) {
        String filePath = "students.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            System.out.println("Students Scoring More Than 80 Marks:");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                int marks = Integer.parseInt(data[3].trim());

                if (marks > 80) {
                    System.out.println(id + " | " + name + " | " + age + " | " + marks);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
