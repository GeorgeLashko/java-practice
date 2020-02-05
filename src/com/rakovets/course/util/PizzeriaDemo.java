package com.rakovets.course.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzeriaDemo {
    public static void main(String[] args) {
        ViewMenu mainMenu = new ViewMenu();
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza("Пицца-лисицца", 33.4));
        pizzas.add(new Pizza("Пепперони", 45.5));
        pizzas.add(new Pizza("Сырная", 65.5));
        pizzas.add(new Pizza("Баварская", 39.9));
        pizzas.add(new Pizza("Стандартная", 45.5));
        mainMenu.printMainMenu();

        // ТипДанных названиеПеременной = new ТипДанных();

        while (true) {
            int numberOfPizza = scanner.nextInt();
            if (numberOfPizza == 0) {
                break;
            } else if (numberOfPizza >= 1 && numberOfPizza <= pizzas.size()) {
                System.out.println(pizzas.get(numberOfPizza - 1));
                System.out.println("Do you want another pizza?");
                System.out.println("press 0 to place an order");
            } else {
                System.out.println("Incorrect data entered");
            }
        }
    }
}
