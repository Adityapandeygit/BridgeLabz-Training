package classandobject;

public class Circle {
	double radius;
    double calculateArea() {
        return 3.14*radius*radius;
    }
    double calculateCircumference() {
        return 2*3.14*radius;
    }

    void display() {
        System.out.printf("Area of circle: %.4f%n", calculateArea());
        System.out.printf("Circumference of circle: %.4f%n", calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 2.5;  
        c.display();
    }
}
