public record Color(int r, int g, int b, int a) {

    public Color {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255 || a < 0 || a > 255) {
            throw new IllegalArgumentException("Kazda wartość musi być w zakresie 0-255.");
        }
    }

    public Color(int r, int g, int b) {
        this(r, g, b, 0);
    }
}
