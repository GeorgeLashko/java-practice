package com.rakovets.course.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzeriaDemo {
    public static void main(String[] args) {
        ViewMenu mainMenu = new ViewMenu();
        Scanner scanner = new Scanner(System.in);
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Пицца-лисицца", 33.4, 1));
        pizzas.add(new Pizza("Пепперони", 45.5, 2));
        pizzas.add(new Pizza("Сырная", 65.5, 3));
        pizzas.add(new Pizza("Баварская", 39.9, 4));
        pizzas.add(new Pizza("Стандартная", 45.5, 5));
        mainMenu.printMainMenu();

        // ТипДанных названиеПеременной = new ТипДанных();

        int numberOfPizza = scanner.nextInt();
        System.out.println(pizzas.get(numberOfPizza - 1));

    }
}
