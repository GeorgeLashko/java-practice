package com.rakovets.course.challenge.oop.inheritance;

public class Siamese extends Cat {
   public Siamese(String name){
       super(name);
   }

    @Override
    void purr() {
       System.out.println("muuuur");
    }

    @Override
    void mew() {
        System.out.println("muew muew");
    }
}
