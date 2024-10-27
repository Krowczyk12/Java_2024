public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(3, 4, 5, 4);

        ShapeDescriber describer = new ShapeDescriber();

        System.out.println("Rectangle:");
        describer.describe(rectangle);

        System.out.println("\nTriangle:");
        describer.describe(triangle);
    }
}
