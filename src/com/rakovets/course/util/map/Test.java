package com.rakovets.course.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Person> mapDemo = new HashMap<>();
        Person person = new Person(987643,"Bob", "Pots");
        mapDemo.put(person.getPhoneNumber(), person);
        person = new Person(54567342,"Tom", "Smith");
        mapDemo.put(person.getPhoneNumber(), person);
        person = new Person(6543783,"Marty", "Strong");
        mapDemo.put(person.getPhoneNumber(), person);
        person = new Person(6785368,"Fill", "Smith");
        mapDemo.put(person.getPhoneNumber(), person);
        person = new Person(542724621,"Mike", "Keygen");
        mapDemo.put(person.getPhoneNumber(), person);
        person = new Person(745678572,"Kaila", "Lennon");
        mapDemo.put(person.getPhoneNumber(), person);
        person = new Person(234135265,"Lee", "Osborn");
        mapDemo.put(person.getPhoneNumber(), person);
        person = new Person(345175443,"Sam", "Pots");
        mapDemo.put(person.getPhoneNumber(), person);

        for (Map.Entry<Integer, Person> item : mapDemo.entrySet()) {
            System.out.printf("Key: %d %s \n", item.getKey(), item.getValue());
        }
    }
}

