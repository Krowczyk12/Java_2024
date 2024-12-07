package org.example;

import jakarta.persistence.Entity;

@Entity
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return 2.0 * (this.width + this.height);
    }

    public void setWidth(double v) {
        this.width = v;
    }
}
