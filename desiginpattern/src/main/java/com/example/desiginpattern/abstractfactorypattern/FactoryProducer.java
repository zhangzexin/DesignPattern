package com.example.desiginpattern.abstractfactorypattern;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type){
        if ("Color".equalsIgnoreCase(type)) {
            return new ColorFactory();
        } else if ("Shape".equalsIgnoreCase(type)) {
            return new ShapeFactory();
        }
        return  null;
    }
}
