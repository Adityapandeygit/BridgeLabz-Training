package oops_practice.scanrio_based;

import java.util.ArrayList;
import java.util.List;

class InvalidMarkException extends RuntimeException {
    public InvalidMarkException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private String[] subjects;
    private int[] marks;
    public Student(String name, String[] subjects, int[] marks) {
        if (subjects.length != marks.length) {
            throw new IllegalArgumentException("Subjects and marks length mismatch");
        }
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        validateMarks();
    }
    private void validateMarks() {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Invalid mark found: " + mark);
            }
        }
    }
    public int calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum/marks.length;
    }
    public String assignGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "D";
    }

    public void displayReport() {
        System.out.println("Student Name : " + name);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + "-" +  marks[i]);
        }
        System.out.println("Average : " + calculateAverage());
        System.out.println("Grade       : " + assignGrade());
    }
}
public class StudentReportGenerator {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
        try {
            students.add(new Student(
                    "Aditya",
                    new String[]{"Maths", "Science", "English"},
                    new int[]{85, 90, 88}
            ));
            students.add(new Student(
                    "Riya",
                    new String[]{"Maths", "Science", "English"},
                    new int[]{72, 65, 70}
            ));
            for (Student s : students) {
                s.displayReport();
            }
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	
}
