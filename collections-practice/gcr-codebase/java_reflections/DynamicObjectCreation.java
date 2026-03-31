package collections_practice.gcr_codebase.java_reflections;

import java.lang.reflect.Constructor;

class Student1 {

    private int id;
    private String name;

    public Student1() {
        System.out.println("Default Constructor Called");
        id = 0;
        name = "Unknown";
    }

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
public class DynamicObjectCreation {
    public static void main(String[] args) {
    	 try {
             // Load class dynamically
             Class<?> cls = Student1.class;
             // ----- Using Default Constructor -----
             Object obj1 = cls.getDeclaredConstructor().newInstance();

             System.out.println("Object Created Using Default Constructor");

             // Call display method
             cls.getMethod("display").invoke(obj1);


             // Using Parameterized Constructor 
             Constructor<?> constructor =
                     cls.getDeclaredConstructor(int.class, String.class);

             Object obj2 = constructor.newInstance(101, "Aditya");

             System.out.println("\nObject Created Using Parameterized Constructor");

             cls.getMethod("display").invoke(obj2);

         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
