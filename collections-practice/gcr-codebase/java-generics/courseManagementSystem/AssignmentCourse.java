package collections_practice.gcr_codebase.java_generics.courseManagementSystem;

public class AssignmentCourse extends CourseType{
	public AssignmentCourse() {
        super("Assignments");
    }
	
    public void evaluate() {
        System.out.println("Evaluated through assignments and submissions.");
    }
}
