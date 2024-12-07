package org.example;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Shape {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Color color;

    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }
    public String getColorDescription() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d",
                color.r(), color.g(), color.b(), color.a());
    }
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
