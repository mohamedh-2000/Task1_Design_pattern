package Shapes;

// Shapes.Circle.java
public class Circle extends Shape implements Prototype {
    private double radius;

    public Circle() {
        this.radius = 5; // Default value
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }
}
