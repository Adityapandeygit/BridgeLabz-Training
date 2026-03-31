package collections_practice.gcr_codebase.java_reflections;

import java.lang.reflect.Field;

class Person {
    private int age;
    public Person() {
        age = 18;
    }
    public void display() {
        System.out.println("Person Object Created");
    }
}
public class PrivateFieldAccess {
	public static void main(String[] args) {
		Person p = new Person();
		try {
		Class<?> cls = p.getClass();
		Field field = cls.getDeclaredField("age");
		field.setAccessible(true);
		// Get current value
        int oldAge = (int) field.get(p);
        System.out.println("Old Age: " + oldAge);

        // Modify value
        field.set(p, 25);

        // Get new value
        int newAge = (int) field.get(p);
        System.out.println("New Age: " + newAge);
		}
        catch (Exception e) {
            e.printStackTrace();
        }
		 
	}
}
