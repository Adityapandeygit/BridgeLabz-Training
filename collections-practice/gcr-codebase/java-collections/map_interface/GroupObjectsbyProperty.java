package collections_practice.gcr_codebase.java_collections.map_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupObjectsbyProperty {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice","HR"));
        employees.add(new Employee("Bob","IT"));
        employees.add(new Employee("Carol","HR"));

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {
            if (!map.containsKey(emp.getDepartment())) {
                map.put(emp.getDepartment(), new ArrayList<>());
            }
            map.get(emp.getDepartment()).add(emp);
        }

        System.out.println(map);
    }
}
