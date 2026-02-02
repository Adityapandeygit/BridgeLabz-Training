package collections_practice.gcr_codebase.java_reflections;

import java.lang.reflect.Method;
import java.util.Scanner;
class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
public class DynamicMethodInvocation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class<?> cls = MathOperations.class;

            // Create object dynamically
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Take user input
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = sc.nextLine();

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Get method dynamically
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Invoke method
            Object result = method.invoke(obj, a, b);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Invalid method name!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
