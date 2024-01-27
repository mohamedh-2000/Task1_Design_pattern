package Shapes;

// Shapes.DrawingBuilder.java
public class DrawingBuilder {
    private String painterName;
    private String drawingName;
    private double cost;
    private double width;
    private double length;

    public DrawingBuilder setPainterName(String painterName) {
        this.painterName = painterName;
        return this;
    }

    public DrawingBuilder setDrawingName(String drawingName) {
        this.drawingName = drawingName;
        return this;
    }

    public DrawingBuilder setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public DrawingBuilder setWidth(double width) {
        this.width = width;
        return this;
    }

    public DrawingBuilder setLength(double length) {
        this.length = length;
        return this;
    }

    public Drawing build() {
        return new Drawing(painterName, drawingName, cost, width, length);
    }


//חלק טיאורתי
//    public class DrawingBuilder {
//        private String painterName;
//        private String drawingName;
//        private double cost;
//        private double width;
//        private double length;
//
//        public DrawingBuilder setPainterName(String painterName) {
//            this.painterName = painterName;
//            return this;
//        }
//
//        public DrawingBuilder setDrawingName(String drawingName) {
//            this.drawingName = drawingName;
//            return this;
//        }
//
//        public DrawingBuilder setCost(double cost) {
//            this.cost = cost;
//            return this;
//        }
//
//        public DrawingBuilder setWidth(double width) {
//            this.width = width;
//            return this;
//        }
//
//        public DrawingBuilder setLength(double length) {
//            this.length = length;
//            return this;
//        }
//
//        public Drawing build() {
//            return new Drawing(painterName, drawingName, cost, width, length);
//        }
//    }

}
