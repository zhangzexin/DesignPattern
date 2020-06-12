package com.example.desiginpattern.buildpepattern;

public abstract class ColdDrink implements Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
