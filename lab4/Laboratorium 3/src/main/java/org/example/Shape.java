package org.example;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Shape {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {
    }

    public Long getId() {
        return id;
    }

    public Color getColor() {
        return this.color;
    }

    public String getColorDescription() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d",
                this.color.r(), this.color.g(), this.color.b(), this.color.a());
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
