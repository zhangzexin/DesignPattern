package com.example.desiginpattern.factorypepattern;

public class FactoryPepatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.onDraw();
    }
}
