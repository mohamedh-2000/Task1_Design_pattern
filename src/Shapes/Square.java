package Shapes;

// Shapes.Square.java
public class Square extends Shape {
    private int sideLength;

    public Square() {
        this.sideLength = 4; // Default value
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        for (int i = 0; i < sideLength; i++) {
            System.out.println("*".repeat(sideLength));
        }
    }
}
