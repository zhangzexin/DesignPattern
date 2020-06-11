package com.example.desiginpattern.abstractfactorypattern;

public class Circle implements Shape {
    @Override
    public void onDraw() {
        System.out.print("我画了个圆");
    }
}
