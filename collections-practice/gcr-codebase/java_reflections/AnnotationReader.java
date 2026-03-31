package collections_practice.gcr_codebase.java_reflections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@interface Author {
    String name();
}
class Book {
    public void display() {
        System.out.println("Book Class");
    }
}
public class AnnotationReader {
	public static void main(String[] args) {

        try {
            // Load class
            Class<?> cls = Class.forName("reflectiondemo.Book");

            // Check if annotation present
            if (cls.isAnnotationPresent(Author.class)) {

                // Get annotation object
                Author author = cls.getAnnotation(Author.class);

                // Print annotation value
                System.out.println("Author Name: " + author.name());
            }
            else {
                System.out.println("Author Annotation Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
