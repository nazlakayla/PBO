package task2;

public class TestShape {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        // Test Circle class
        Circle circle = new Circle(5.5, "red", false);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Test Rectangle class
        Rectangle rectangle = new Rectangle(4.0, 5.0, "yellow", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test Square class
        Square square = new Square(6.0, "green", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}