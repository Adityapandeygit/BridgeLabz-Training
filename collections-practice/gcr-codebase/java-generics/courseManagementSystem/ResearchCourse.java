package collections_practice.gcr_codebase.java_generics.courseManagementSystem;

public class ResearchCourse extends CourseType{
	public ResearchCourse() {
        super("Research Work");
    }

    public void evaluate() {
        System.out.println("Evaluated through research papers and thesis.");
    }
}
