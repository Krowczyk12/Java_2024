package org.example;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;

    }
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

