package collections_practice.gcr_codebase.java_reflections;

import java.lang.reflect.Field;
class Student4 {
    private int id;
    private String name;
    private double marks;

    public Student4(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}


class JsonUtil {

    public static String toJson(Object obj) {

        try {
            Class<?> cls = obj.getClass();

            Field[] fields = cls.getDeclaredFields();

            StringBuilder json = new StringBuilder();
            json.append("{");

            for (int i = 0; i < fields.length; i++) {

                Field field = fields[i];
                field.setAccessible(true);

                String name = field.getName();
                Object value = field.get(obj);

                json.append("\"").append(name).append("\":");

                // Add quotes for String values
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            }

            json.append("}");
            return json.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
public class TestJson {
	public static void main(String[] args) {

        Student s = new Student(101, "Aditya", 95.5);

        String json = JsonUtil.toJson(s);

        System.out.println(json);
    }
}
