package classandobject;

public class Student {
	String name;
	String rollNumber;
	double mark1, mark2, mark3;
	char calculateGrade() {
        double average = (mark1+mark2+mark3)/3;
        if (average >= 80) {
            return 'A';
        } else if (average >= 70) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }
	void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Grade " + calculateGrade());
    }
	
	public static void main(String[] args) {
		// Creating object of class and passing the details 
		Student s1 = new Student();
		s1.name = "Thamarai";
        s1.rollNumber = "ECE001";
        s1.mark1 = 80.0;
        s1.mark2 = 70.0;
        s1.mark3 = 75.0;
        
        Student s2 = new Student();
        s2.name = "Kannan";
        s2.rollNumber = "CSC002";
        s2.mark1 = 60.0;
        s2.mark2 = 65.0;
        s2.mark3 = 50.0;
        // Calling methods
        s1.displayDetails();
        s2.displayDetails();

	}
	
}
