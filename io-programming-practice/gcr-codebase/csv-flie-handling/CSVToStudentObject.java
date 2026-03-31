package io_programing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    String email;
    String course;
    int marks;
    public Student(int id, String name, String email, String course, int marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + email + " | " + course + " | " + marks;
    }
}
public class CSVToStudentObject {
	public static void main(String[] args) {
        String filePath = "students.csv";
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Student student = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        data[3],
                        Integer.parseInt(data[4])
                );
                studentList.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Student List:");
        studentList.forEach(System.out::println);
    }
}
