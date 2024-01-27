// Shapes.Triangle.java
package Shapes;
public class Triangle extends Shape {
    private int height;

    public Triangle() {
        this.height = 4; // Default value
    }

    public Triangle(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
