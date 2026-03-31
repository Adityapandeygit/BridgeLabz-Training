package collections_practice.gcr_codebase.java_reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {

    private int id;
    public String name;
    protected double marks;
    public Student() {
        System.out.println("Default Constructor");
    }
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public void display() {
        System.out.println("Student Display Method");
    }

    private void calculateGrade() {
        System.out.println("Private Method");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
 
public class ClassInformation {
	public static void main(String[] args) throws ClassNotFoundException {
		try {

            Class<?> cls = Class.forName("Student");

            System.out.println("Class Name: " + cls.getName());
            // Constructors
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println(c);
            }

            // Fields
            System.out.println("\n--- Fields ---");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f);
            }

            // Methods
            System.out.println("\n--- Methods ---");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
	}
}
