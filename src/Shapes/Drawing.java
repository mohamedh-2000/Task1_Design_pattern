package Shapes;

// Shapes.Drawing.java
public class Drawing {
    private String painterName;
    private String drawingName;
    private double cost;
    private double width;
    private double length;

    public Drawing(String painterName, String drawingName, double cost, double width, double length) {
        this.painterName = painterName;
        this.drawingName = drawingName;
        this.cost = cost;
        this.width = width;
        this.length = length;
    }
}
