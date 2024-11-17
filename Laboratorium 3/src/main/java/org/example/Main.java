package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Color red = new Color(255, 0, 0, 255);
        Color blue = new Color(0, 0, 255, 255);
        Color green = new Color(0, 255, 0, 255);

        Shape rectangle = new Rectangle(5, 3, red);
        Shape triangle = new Triangle(3, 4, 5, blue);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(triangle);

        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(shapes);
    }
}

