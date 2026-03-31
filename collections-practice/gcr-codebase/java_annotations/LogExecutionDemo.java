package collections_practice.gcr_codebase.java_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)

@interface LogExecutionTime { }
class TaskService {
    @LogExecutionTime
    public void slowTask() throws Exception {
        Thread.sleep(500);   // Simulate slow work
        System.out.println("Slow Task Done");
    }

    @LogExecutionTime
    public void fastTask() throws Exception {
        Thread.sleep(100);   // Simulate fast work
        System.out.println("Fast Task Done");
    }
}
public class LogExecutionDemo {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
	
	TaskService service = new TaskService();
    Method[] methods = TaskService.class.getDeclaredMethods();
    for (Method m : methods) {
        if (m.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            m.invoke(service);   // Run method

            long end = System.nanoTime();

            System.out.println("Execution Time of " + m.getName() + " : "
                    + (end - start) + " ns");
        }
    }
}
}
