package collections_practice.gcr_codebase.java_annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Container Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

// Repeatable Annotation
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

// Class Using Annotation
class BugTracker {

    @BugReport(description = "Login issue")
    @BugReport(description = "UI issue")
    public void testMethod() {
        System.out.println("Running method");
    }
}

// Main Class
public class RepeatableAnnotationDemo {

    public static void main(String[] args) throws Exception {

        Method m = BugTracker.class.getMethod("testMethod");

        BugReport[] reports = m.getAnnotationsByType(BugReport.class);

        for (BugReport r : reports) {
            System.out.println(r.description());
        }
    }
}
