public class Circle {
    private int radius;
    private Point center;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;

    }

    public int getRadius() {
        radius = MathTools.randInt(1,10);
        return radius;
    }

    public double getArea() {
        double area = MathTools.round((Math.pow(radius, 2) * Math.PI),2);
        return area;
    }
}






