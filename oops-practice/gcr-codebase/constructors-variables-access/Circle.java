package constructors;

public class Circle {
	double radius;
	Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }
    
    void display() {
    	System.out.println("Radius of circle :"+radius);
    }
    
    public static void main(String[] args) {
		Circle circle = new Circle();
		circle.display();
		
		Circle circle2 = new Circle(5.0);
		circle2.display();
	}
}	
