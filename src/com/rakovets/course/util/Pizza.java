package com.rakovets.course.util;

public class Pizza {
    private String name;
    private double cost;
    private int pizzaID;

    public Pizza(String name, double cost, int pizzaID) {
        this.name = name;
        this.cost = cost;
        this.pizzaID = pizzaID;
    }

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
