package com.example.desiginpattern.buildpepattern;

import java.util.ArrayList;

public class Meal {
    ArrayList<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }

    public float getCost() {
        float cost = 0;
        if (items.size()>0) {
            for (Item item : items) {
                cost += item.price();
            }
        }
        return cost;
    }

    public void showItem(){
        if (items.size()>0) {
            for (Item item : items) {
                System.out.print(item.name());
                System.out.print(item.getPacking());
                System.out.print(item.price());
            }
        }
    }
}
