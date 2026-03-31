package oops_practice.scanrio_based.StudentCourseRegistrationSystem;

public class CourseLimitExceededException extends Exception {
    CourseLimitExceededException(String msg) {
        super(msg);
    }
}
