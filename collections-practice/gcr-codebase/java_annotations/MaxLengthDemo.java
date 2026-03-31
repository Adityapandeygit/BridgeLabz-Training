package collections_practice.gcr_codebase.java_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

// Step 2: Use Annotation in Class
class User {

    @MaxLength(10)
    private String username;

    // Constructor with Validation
    public User(String username) {

        try {
            Field field = this.getClass().getDeclaredField("username");

            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength max = field.getAnnotation(MaxLength.class);

                if (username.length() > max.value()) {
                    throw new IllegalArgumentException(
                        "Username length exceeds " + max.value()
                    );
                }
            }

            this.username = username;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void display() {
        System.out.println("Username: " + username);
    }
}
public class MaxLengthDemo {
	public static void main(String[] args) {
        User u1 = new User("Aditya");     // Valid
        u1.display();

        User u2 = new User("AdityaPandey123");  
        u2.display();
    }
}	
