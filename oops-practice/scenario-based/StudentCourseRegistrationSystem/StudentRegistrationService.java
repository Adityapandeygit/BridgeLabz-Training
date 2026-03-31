package oops_practice.scanrio_based.StudentCourseRegistrationSystem;

public class StudentRegistrationService extends RegistrationService {

    public void enroll(Student s, String course)
            throws CourseLimitExceededException {

        if (s.getCourses().size() == 3) {
            throw new CourseLimitExceededException("Maximum 3 courses allowed");
        }

        s.getCourses().add(course);
        System.out.println("Enrolled in " + course);
    }

}
