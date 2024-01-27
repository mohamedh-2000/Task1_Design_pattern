package Shapes;

// Shapes.Rectangle.java
public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 4; // Default value
        this.width = 4;  // Default value
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        for (int i = 0; i < length; i++) {
            System.out.println("*".repeat(width));
        }
    }
}
