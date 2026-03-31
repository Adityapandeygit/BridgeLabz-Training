package collections_practice.gcr_codebase.java_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class ProjectWork {

    @Todo(task = "Create login feature", assignedTo = "Aditya")
    public void loginFeature() { }

    @Todo(task = "Fix payment bug", assignedTo = "Rahul", priority = "HIGH")
    public void paymentFix() { }

    @Todo(task = "Improve UI design", assignedTo = "Sneha")
    public void uiUpdate() { }
}
public class TodoDemo {
	public static void main(String[] args) {

        Method[] methods = ProjectWork.class.getDeclaredMethods();

        for (Method m : methods) {

            if (m.isAnnotationPresent(Todo.class)) {

                Todo todo = m.getAnnotation(Todo.class);

                System.out.println("Method: " + m.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
            }
        }
    }
}
