package com.example.desiginpattern.prototypepattern;

public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape = ShapeCache.getShape("1");
        System.out.print(shape.getType());

        Shape shape1 = ShapeCache.getShape("2");
        System.out.print(shape1.getType());
    }
}
