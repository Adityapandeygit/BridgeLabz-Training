package collections_practice.gcr_codebase.java_generics.courseManagementSystem;

public abstract class CourseType {
	String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public abstract void evaluate();
}
