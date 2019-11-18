package com.rakovets.course.challenge.oop.inheritance;

public class Program {
    public static void main(String[] args) {
        Cat sam = new Cat("Sam");
        Cat tom = new Siamese("Tom");
        Cat dima = new Sphynx("Dima");
        Person gim = new Person(50);
        sam.mew();
        sam.purr();
        tom.purr();
        tom.getName();
        tom.SetName("Simon");
        tom.getName();
        sam.SetName("jon");
        sam.getName();
        dima.purr();
        dima.mew();
        dima.getName();
        dima.SetName("kim");
        dima.getName();

    }
}
