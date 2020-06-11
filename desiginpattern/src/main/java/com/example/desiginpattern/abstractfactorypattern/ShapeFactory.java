package com.example.desiginpattern.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory {


    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
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
