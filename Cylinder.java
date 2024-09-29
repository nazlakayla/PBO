package task1;

public class Cylinder extends Circle {  // Save as "Cylinder.java"
    private double height;  // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super();        // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super();        // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // Override the getArea() method to compute the surface area of the cylinder
    @Override
    public double getArea() {
        double baseArea = super.getArea();  // Get the area of the circle (base area)
        return 2 * Math.PI * getRadius() * height + 2 * baseArea;  // Surface area of cylinder
    }

    // A public method for computing the volume of cylinder
    public double getVolume() {
        return super.getArea() * height;  // Volume = base area * height
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}