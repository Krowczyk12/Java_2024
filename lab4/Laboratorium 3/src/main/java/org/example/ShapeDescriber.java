package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    // Logger SLF4J
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    public void describe(Shape shape) {
        logger.info("Describing shape of type: {}", shape.getClass().getSimpleName());
        logger.info("Color: {}", shape.getColorDescription());

        double area = shape.calculateArea();
        logger.info("Area: {}", area);

        double perimeter = shape.calculatePerimeter();
        logger.info("Perimeter: {}", perimeter);

        System.out.println("Shape description logged successfully.");
    }
}


