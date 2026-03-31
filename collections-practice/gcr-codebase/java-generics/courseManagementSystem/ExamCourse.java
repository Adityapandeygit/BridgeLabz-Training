package collections_practice.gcr_codebase.java_generics.courseManagementSystem;

public class ExamCourse extends CourseType{
	public ExamCourse() {
        super("Written Exam");
    }

    public void evaluate() {
        System.out.println("Evaluated through final written examination.");
    }
}
