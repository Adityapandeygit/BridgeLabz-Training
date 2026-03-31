package io_programing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetectDuplicateCSV {
	public static void main(String[] args) {
        String filePath = "students.csv";
        Set<String> uniqueIds = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                if (!uniqueIds.add(id)) {
                    duplicates.add(line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Duplicate Records:");
        duplicates.forEach(System.out::println);
    }
}
