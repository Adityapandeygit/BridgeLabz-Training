package io_programing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\a\\Desktop\\students.csv";
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            while ((line = br.readLine()) != null) {

                // Split using comma
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);
                System.out.println("ID    : " + id);
                System.out.println("Name  : " + name);
                System.out.println("Age   : " + age);
                System.out.println("Marks : " + marks);
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
	}
}
