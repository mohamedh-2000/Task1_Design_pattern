package Shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קלט מהמשתמש
        System.out.println("Enter shape name (Square/Rectangle/Triangle):");
        String shapeName = scanner.nextLine();

        // בדיקה ויצירת הצורה המתאימה
        ShapeFactory shapeFactory;
        switch (shapeName.toLowerCase()) {
            case "square":
                shapeFactory = new SquareFactory();
                break;
            case "rectangle":
                shapeFactory = new RectangleFactory();
                break;
            case "triangle":
                shapeFactory = new TriangleFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid shape name");
        }

        // יצירה וציור הצורה
        Shape shape = shapeFactory.createAndDrawShape();

        // בדיקת ה-Prototype Design Pattern
        System.out.println("Creating and drawing a generic Shape:");
        Shape genericShape = new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing a generic shape");
            }
        };
        genericShape.draw();

        // יצירת עותק של Circle באמצעות ה-Prototype
        System.out.println("Creating and drawing a Circle using Prototype:");
        Prototype circlePrototype = new Circle();
        Circle clonedCircle = (Circle) circlePrototype.clone();
        clonedCircle.draw();
    }


//    חלק תיאורטי
//    Drawing drawing = new DrawingBuilder()
//            .setPainterName("Picasso")
//            .setDrawingName("Masterpiece")
//            .setCost(1000000.0)
//            .setWidth(120.0)
//            .setLength(120.0)
//            .build();

}
