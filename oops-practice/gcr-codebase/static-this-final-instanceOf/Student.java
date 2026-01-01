package staticfinalinstanceOf;

public class Student {
	static String universityName = "Global Tech University";
    static int totalStudents = 0;
    String name;
    String grade;
    final int rollNumber;
    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    static void displayTotalStudents() {
    	System.out.println("University Name: "+ universityName);
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
        } else {
            System.out.println("Object is not a Student");
        }
    }
    void updateGrade(Object obj, String newGrade) {

        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated successfully");
        } else {
            System.out.println("Cannot update grade. Object is not a Student");
        }
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anita", "A");
        Student s2 = new Student(102, "Rahul", "B");
        Student.displayTotalStudents();
        System.out.println();
        s1.displayStudentDetails(s1);
        System.out.println();
        s1.updateGrade(s1, "A+");
        s1.displayStudentDetails(s1);
        System.out.println();
        s2.displayStudentDetails(s2);
    }
}
