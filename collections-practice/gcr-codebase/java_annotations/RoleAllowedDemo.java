package collections_practice.gcr_codebase.java_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface RoleAllowed {
    String value();
}

// Step 2: Service Class
class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User Deleted Successfully");
    }

    @RoleAllowed("USER")
    public void viewProfile() {
        System.out.println("Profile Viewed");
    }
}

public class RoleAllowedDemo {
	public static void main(String[] args) throws Exception {
        String currentUserRole = "USER";   
        AdminService service = new AdminService();
        Method[] methods = AdminService.class.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed role = m.getAnnotation(RoleAllowed.class);
                if (role.value().equals(currentUserRole)) {
                    m.invoke(service);   // Allow execution
                } else {
                    System.out.println("Access Denied! You need "
                            + role.value() + " role for " + m.getName());
                }
            }
        }
    }
}	
