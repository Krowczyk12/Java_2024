package org.example;

public abstract class Shape {
    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getColorDescription() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d",
                color.r(), color.g(), color.b(), color.a());
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter(); // Nowa metoda abstrakcyjna
}
