package collections_practice.gcr_codebase.java_reflections;

import java.lang.reflect.Method;

class Calculator {

    private int multiply(int a, int b) {
        return a * b;
    }

    public void display() {
        System.out.println("Calculator Object Created");
    }
}

public class PrivateMethodInvoke {
	public static void main(String[] args) {
		try {
			// Create object
            Calculator calc = new Calculator();

            // Get Class object
            Class<?> cls = calc.getClass();

            // Get private method
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Allow access to private method
            method.setAccessible(true);

            // Invoke method
            Object result = method.invoke(calc, 5, 4);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        
		}
	}
}
