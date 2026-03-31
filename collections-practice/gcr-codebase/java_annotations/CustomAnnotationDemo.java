package collections_practice.gcr_codebase.java_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Aditya")
    public void completeTask() {
        System.out.println("Task Completed");
    }
}


public class CustomAnnotationDemo {
	public static void main(String[] args) {
		try {
            TaskManager tm = new TaskManager();

            // Get Class Object
            Class<?> obj = tm.getClass();

            // Get Method Object
            Method method = obj.getMethod("completeTask");

            // Check Annotation Present
            if (method.isAnnotationPresent(TaskInfo.class)) {

                // Get Annotation Object
                TaskInfo info = method.getAnnotation(TaskInfo.class);

                System.out.println("Priority: " + info.priority());
                System.out.println("Assigned To: " + info.assignedTo());
            }

            // Call Method
            tm.completeTask();

        } catch (Exception e) {
            e.printStackTrace();
        }
	
	}
}
