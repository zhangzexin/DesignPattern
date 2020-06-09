package com.example.desiginpattern.prototypepattern;

import java.util.HashMap;

public class ShapeCache {

    private static HashMap<String ,Shape> map = new HashMap<>();

    public static Shape getShape(String id){
        Shape shape = map.get(id);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId(1);
        map.put(String.valueOf(rectangle.getId()),rectangle);

        Square square = new Square();
        square.setId(2);
        map.put(String.valueOf(square.getId()),square);
    }
}
