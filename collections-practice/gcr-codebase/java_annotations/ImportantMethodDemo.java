package collections_practice.gcr_codebase.java_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Step 1: Create Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
 String level() default "HIGH";
}

class ServiceClass {

    @ImportantMethod
    public void processData() {
        System.out.println("Processing Data");
    }

    @ImportantMethod(level = "LOW")
    public void logData() {
        System.out.println("Logging Data");
    }

    public void normalMethod() {
        System.out.println("Normal Method");
    }
}
public class ImportantMethodDemo {
	public static void main(String[] args) {
        Method[] methods = ServiceClass.class.getDeclaredMethods();

        for (Method m : methods) {

            if (m.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod im = m.getAnnotation(ImportantMethod.class);

                System.out.println("Method Name: " + m.getName());
                System.out.println("Importance Level: " + im.level());
            }
        }
    }
}
