package com.example.desiginpattern.abstractfactorypattern;

public class FactoryProducerDemo {
    public static void main(String[] args) {
        AbstractFactory color = FactoryProducer.getFactory("Color");
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Color red = color.getColor("red");
        red.fill();

        Shape circle = shape.getShape("Circle");
        circle.onDraw();
    }
}
