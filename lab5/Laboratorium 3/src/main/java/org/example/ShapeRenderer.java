package org.example;
import java.util.List;

public class ShapeRenderer {

    public void renderShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Rendering shape: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColorDescription());
            System.out.println("Graphic Representation:");
            drawShape(shape);
            System.out.println();
        }
    }

    private void drawShape(Shape shape) {
        if (shape instanceof Rectangle rectangle) {
            for (int rows = 0; rows < (int) rectangle.getHeight(); rows++) {
                System.out.println("*".repeat((int) rectangle.getWidth()));
            }
        } else if (shape instanceof Triangle triangle) {
            int height = (int) triangle.getHeight();

            for (int i = 1; i <= height; i++) {
                System.out.println(" ".repeat(height - i) + "*".repeat(2 * i - 1));
            }
        } else {
            System.out.println("[No specific renderer for this shape]");
        }
    }

}

