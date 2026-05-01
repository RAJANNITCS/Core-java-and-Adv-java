// WAP to demostrating SealtedClass

// Parent sealed class
sealed abstract class Shape permits Circle, Rectangle {

    // Common method
    public abstract double area();

}

// Final class - > cannot be extended
final class Circle extends Shape {

    private double radius; // Instance variable

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Sealed subclass → restrict further
sealed class Rectangle extends Shape
        permits Square {

    protected double length;
    protected double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double area() {
        return length * width;
    }
}

// Final subclass
final class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}

public class SealedClassExample {
    
}
