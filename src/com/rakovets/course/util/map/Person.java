package com.rakovets.course.util.map;

public class Person {
    private int phoneNumber;
    private String name;
    private String surname;

    public Person(int phoneNumber, String name, String surname) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return "{" +
                "phoneNumber --> " + phoneNumber +
                ", name--> " + name  +
                ", surname-->" + surname  +
                '}';
    }
}
