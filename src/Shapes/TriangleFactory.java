// Shapes.TriangleFactory.java
package Shapes;
public class TriangleFactory extends ShapeFactory {
    @Override
    public Shape createAndDrawShape() {
        Triangle triangle = new Triangle();
        triangle.draw();
        return triangle;
    }
}