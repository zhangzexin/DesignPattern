package com.example.desiginpattern.buildpepattern;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百世可乐";
    }

    @Override
    public float price() {
        return 5f;
    }
}
