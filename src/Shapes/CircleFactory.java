package Shapes;
    // Shapes.CircleFactory.java
    public class CircleFactory extends ShapeFactory {
        @Override
        public Shape createAndDrawShape() {
            Circle circle = new Circle();
            circle.draw();
            return circle;
        }
    }
