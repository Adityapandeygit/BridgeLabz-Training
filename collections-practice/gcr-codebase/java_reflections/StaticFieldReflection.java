package collections_practice.gcr_codebase.java_reflections;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";
    public static void showKey() {
        System.out.println("API KEY: " + API_KEY);
    }
}
public class StaticFieldReflection {
	public static void main(String[] args) {
        try {
            // Load class
            Class<?> cls = Configuration.class;
            // Get private static field
            Field field = cls.getDeclaredField("API_KEY");
            // Allow private access
            field.setAccessible(true);
            // Get old value (static field → object = null)
            String oldValue = (String) field.get(null);
            System.out.println("Old API KEY: " + oldValue);
            // Modify value
            field.set(null, "NEW_SECRET_KEY_123");
            // Get new value
            String newValue = (String) field.get(null);
            System.out.println("New API KEY: " + newValue);
            // Call class method to verify
            Configuration.showKey();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
