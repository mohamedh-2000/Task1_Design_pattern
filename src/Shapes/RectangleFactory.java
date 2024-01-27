// Shapes.RectangleFactory.java
package Shapes;
public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createAndDrawShape() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        return rectangle;
    }
}
