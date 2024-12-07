package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Triangle extends Shape {

    @Column(name = "triangle_side_a")
    private double a;

    @Column(name = "triangle_side_b")
    private double b;

    @Column(name = "triangle_side_c")
    private double c;

    public Triangle(double a, double b, double c, Color color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }


    public double getHeight() {
        double s = (a + b + c) / 2.0; // Półobwód
        return (2.0 / a) * Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
