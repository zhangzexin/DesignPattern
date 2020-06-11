package com.example.desiginpattern.abstractfactorypattern;

public class Rectangle implements Shape {
    @Override
    public void onDraw() {
        System.out.print("我画了个长方形");
    }
}
