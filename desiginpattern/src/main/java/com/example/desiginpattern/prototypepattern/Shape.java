package com.example.desiginpattern.prototypepattern;

import androidx.annotation.NonNull;

public class Shape implements Cloneable {
    private int id;
    private String type;


    public void setId(int id) {
        id = id;
    }

    public int getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @NonNull
    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }
}
