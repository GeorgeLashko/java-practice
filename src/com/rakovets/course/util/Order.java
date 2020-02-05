package com.rakovets.course.util;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int orderCost;
    private Map<Pizza, Integer> orderPizzas = new HashMap<>();

    public void addPizzas(Pizza pizza, int count) {
        orderPizzas.put(pizza, count);
    }


}
