package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Color {

    private int r;
    private int g;
    private int b;
    private int a;

    public Color(int r, int g, int b, int a) {
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255 && a >= 0 && a <= 255) {
            this.r = r;
            this.g = g;
            this.b = b;
            this.a = a;
        } else {
            throw new IllegalArgumentException("Każda wartość musi być w zakresie 0-255.");
        }
    }

    public Color() {
    }

    public int r() {
        return this.r;
    }

    public int g() {
        return this.g;
    }

    public int b() {
        return this.b;
    }

    public int a() {
        return this.a;
    }
}
