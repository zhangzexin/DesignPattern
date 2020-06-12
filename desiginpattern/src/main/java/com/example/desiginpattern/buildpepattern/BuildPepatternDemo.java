package com.example.desiginpattern.buildpepattern;

public class BuildPepatternDemo {

    public static void main(String[] args) {
        Meal meal = new MealBuild().prepareChickenMeal();
        meal.showItem();
        System.out.print(meal.getCost());
    }

}
