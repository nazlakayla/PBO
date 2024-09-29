package task2;

public class Circle extends Shape {
    private double radius;

    // No-argument constructor
    public Circle() {
        super();  // Default to Shape's no-arg constructor
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString() method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}