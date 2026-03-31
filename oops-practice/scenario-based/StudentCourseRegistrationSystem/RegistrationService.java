package oops_practice.scanrio_based.StudentCourseRegistrationSystem;

public abstract class RegistrationService {
	abstract void enroll(Student s, String course)
            throws CourseLimitExceededException;
}
