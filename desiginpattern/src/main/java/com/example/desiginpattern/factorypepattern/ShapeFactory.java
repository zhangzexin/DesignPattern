package com.example.desiginpattern.factorypepattern;

public class ShapeFactory {


    public Shape getShape(String type){
        if ("Circle".equals(type)) {
            return  new Circle();
        } else if ("Square".equals(type)){
            return new Square();
        } else if ("Rectangle".equals(type)) {
            return new Rectangle();
        }
        return null;
    }

}
