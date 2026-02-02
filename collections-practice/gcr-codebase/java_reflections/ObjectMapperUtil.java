package collections_practice.gcr_codebase.java_reflections;

import java.lang.reflect.Field;
import java.util.Map;
class Student5 {
    private int id;
    private String name;
    private double marks;

    public Student5() {
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class ObjectMapperUtil {
	public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create object dynamically
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Loop through map entries
            for (Map.Entry<String, Object> entry : properties.entrySet()) {

                String fieldName = entry.getKey();
                Object value = entry.getValue();

                try {
                    // Get field from class
                    Field field = clazz.getDeclaredField(fieldName);

                    // Allow private access
                    field.setAccessible(true);

                    // Set value
                    field.set(obj, value);

                } catch (NoSuchFieldException e) {
                    System.out.println("Field not found: " + fieldName);
                }
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
