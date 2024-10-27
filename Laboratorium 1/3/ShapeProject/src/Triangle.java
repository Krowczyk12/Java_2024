public class Triangle extends Shape {
    private double a, b, c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * a * height;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
