package com.rakovets.course.challenge.oop.inheritance;

public class Sphynx extends Cat {
    public Sphynx(String name){
        super(name);
    }

    @Override
    void purr() {
        System.out.println("mur mur mur");
    }

    @Override
    void mew() {
        System.out.println("mew mew");
    }
}
