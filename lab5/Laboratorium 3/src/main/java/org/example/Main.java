package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeDAO shapeDAO = new ShapeDAO();

        try {
            // Tworzenie obiektów
            Shape rectangle = new Rectangle(5.0, 3.0, new Color(255, 0, 0, 255));
            Shape triangle = new Triangle(3.0, 4.0, 5.0, new Color(0, 0, 255, 255));

            // Zapis obiektów do bazy
            shapeDAO.save(rectangle);
            shapeDAO.save(triangle);

            // Odczyt wszystkich kształtów z bazy
            List<Shape> shapes = shapeDAO.findAll();
            System.out.println("Wszystkie kształty w bazie:");
            for (Shape shape : shapes) {
                System.out.println(shape.getClass().getSimpleName() + " - " +
                        "Area: " + shape.calculateArea() +
                        ", Perimeter: " + shape.calculatePerimeter());
            }

            // Odczyt konkretnego kształtu po ID
            Rectangle retrievedRectangle = shapeDAO.findById(1L, Rectangle.class);
            if (retrievedRectangle != null) {
                System.out.println("Odczytano kształt o ID 1: " + retrievedRectangle.getClass().getSimpleName());
            } else {
                System.out.println("Nie znaleziono kształtu o ID 1.");
            }

            // Usuwanie kształtu
            shapeDAO.delete(1L, Rectangle.class);
            System.out.println("Usunięto kształt o ID 1.");

            // Odczyt wszystkich kształtów po usunięciu
            shapes = shapeDAO.findAll();
            System.out.println("Wszystkie kształty w bazie po usunięciu:");
            for (Shape shape : shapes) {
                System.out.println(shape.getClass().getSimpleName());
            }
        } finally {
            // Zamknięcie DAO
            shapeDAO.close();
        }
    }
}
