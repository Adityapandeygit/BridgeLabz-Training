package collections_practice.gcr_codebase.java_generics.courseManagementSystem;

public class Course<T extends CourseType> {
	String courseName;
	T courseType;
	public Course(String courseName,T courseType) {
		this.courseName = courseName;
        this.courseType = courseType;
	}
	public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Evaluation Method: " + courseType.evaluationMethod);
        courseType.evaluate();
    }
}
