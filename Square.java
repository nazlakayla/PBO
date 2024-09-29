package task2;

public class Square extends Rectangle {

    // Constructor with side
    public Square(double side) {
        super(side, side);  // Call Rectangle constructor
    }

    // Constructor with side, color, and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Override setLength() and setWidth() to ensure square property
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);  // Keep both width and length the same
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);  // Keep both width and length the same
    }

    // toString() method
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}