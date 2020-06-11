package com.example.desiginpattern.abstractfactorypattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if ("red".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("green".equalsIgnoreCase(color)) {
            return new Blue();
        } else if ("blue".equalsIgnoreCase(color)) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
