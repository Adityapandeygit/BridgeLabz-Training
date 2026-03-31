package io_programing;
import java.io.*;
import java.util.*;

class StudentBasic {
    int id;
    String name;
    int age;

    public StudentBasic(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class MergeAndWriteCSV {
    public static void main(String[] args) {
        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";
        Map<Integer, StudentBasic> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                map.put(id, new StudentBasic(id, name, age));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                BufferedReader br = new BufferedReader(new FileReader(file2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            br.readLine(); 
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                int marks = Integer.parseInt(data[1]);
                String grade = data[2];

                if (map.containsKey(id)) {

                    StudentBasic s = map.get(id);

                    String mergedRow = id + "," +
                            s.name + "," +
                            s.age + "," +
                            marks + "," +
                            grade;

                    bw.write(mergedRow);
                    bw.newLine();
                }
            }

            System.out.println("✅ Merged file created: " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
