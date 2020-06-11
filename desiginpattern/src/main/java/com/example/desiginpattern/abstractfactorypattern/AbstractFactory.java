package com.example.desiginpattern.abstractfactorypattern;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String type);
}
