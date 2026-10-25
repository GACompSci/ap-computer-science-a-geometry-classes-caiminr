public class App {
    public static void main(String[] args) throws Exception {
        Point p1 = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));
        Point p2 = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));
        Point p3 = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));

        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p2.getX());
        System.out.println(p2.getY());

    
        Circle circle = new Circle(MathTools.randInt(1, 10), p1);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(p1, MathTools.randInt(1, 10),MathTools.randInt(1, 10));
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println(triangle.getArea());
    }
}