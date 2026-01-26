package collections_practice.gcr_codebase.java_streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeSerializationDemo {

    private static final String SOURCE =
            "C:\\Users\\a\\Desktop\\Source.txt";

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Aditya", "IT", 60000));
        employees.add(new Employee(2, "Rahul", "HR", 45000));
        employees.add(new Employee(3, "Neha", "Finance", 55000));

        serializeEmployees(employees);
        deserializeEmployees();
    }

    // Serialize
    public static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(SOURCE))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization:");
            e.printStackTrace();
        }
    }

    // Deserialize
    public static void deserializeEmployees() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(SOURCE))) {

            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee List:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println("IO Error during deserialization:");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found:");
            e.printStackTrace();
        }
    }
}
