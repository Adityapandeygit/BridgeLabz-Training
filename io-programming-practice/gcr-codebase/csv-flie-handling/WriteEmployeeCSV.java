package io_programing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
	public static void main(String[] args) {
        String filePath = "C:\\Users\\a\\Desktop\\students.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Write Header
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            // Write Records
            bw.write("101,Aditya,IT,50000");
            bw.newLine();

            bw.write("102,Rahul,HR,40000");
            bw.newLine();

            bw.write("103,Neha,Finance,55000");
            bw.newLine();

            bw.write("104,Amit,Sales,45000");
            bw.newLine();

            bw.write("105,Priya,IT,60000");
            bw.newLine();

            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
