package io_programing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class UpdateEmployeeSalaryCSV {
	public static void main(String[] args) {
        String inputFile = "employees.csv";
        String outputFile = "employees_updated.csv";
        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            line = br.readLine();
            bw.write(line);
            bw.newLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String dept = data[2].trim();
                double salary = Double.parseDouble(data[3].trim());

                if (dept.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);  
                }
                bw.write(id + "," + name + "," + dept + "," + (int)salary);
                bw.newLine();
            }

            System.out.println("Updated CSV file created successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
