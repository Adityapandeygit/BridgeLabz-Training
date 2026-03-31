package io_programing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
	public static void main(String[] args) {
        String filePath = "employee.csv";
        int rowCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            while (br.readLine() != null) {
                rowCount++;
            }
            System.out.println("Total Records (excluding header): " + rowCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
