package oops_practice.scanrio_based.StudentCourseRegistrationSystem;

public class Main {
	public static void main(String[] args) {
		Student s = new Student(101, "Aditya");
        RegistrationService service = new StudentRegistrationService();

        try {
            service.enroll(s, "Java");
            service.enroll(s, "DBMS");
            service.enroll(s, "OS");
            service.enroll(s, "CN"); // exception 
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Courses: " + s.getCourses());
	}
}
