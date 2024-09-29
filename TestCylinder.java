package task1;

public class TestCylinder {  // Save as "TestCylinder.java"
    public static void main (String[] args) {
        // Declare and allocate a new instance of Cylinder with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " surface area=" + c1.getArea()  // Prints surface area after overriding
                + " volume=" + c1.getVolume());  // Volume should still work correctly
        System.out.println(c1.toString());  // Testing the overridden toString() method

        // Declare and allocate a new instance of Cylinder specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " surface area=" + c2.getArea()  // Prints surface area
                + " volume=" + c2.getVolume());  // Prints volume
        System.out.println(c2.toString());  // Testing the overridden toString() method

        // Declare and allocate a new instance of Cylinder specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " surface area=" + c3.getArea()  // Prints surface area
                + " volume=" + c3.getVolume());  // Prints volume
        System.out.println(c3.toString());  // Testing the overridden toString() method
    }
}