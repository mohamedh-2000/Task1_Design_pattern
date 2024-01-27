// Shapes.SquareFactory.java
package Shapes;
public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createAndDrawShape() {
        Square square = new Square();
        square.draw();
        return square;
    }
}