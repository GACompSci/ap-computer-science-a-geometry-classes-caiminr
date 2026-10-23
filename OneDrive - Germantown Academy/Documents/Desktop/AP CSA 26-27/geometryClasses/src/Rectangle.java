public class Rectangle {
    private Point topLeft;
    private int length;
    private int width;


    public Rectangle(Point topLeft, int length, int width) {
        this.topLeft = topLeft;
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = MathTools.round((length * width), 2);
        return area;

    }

}

