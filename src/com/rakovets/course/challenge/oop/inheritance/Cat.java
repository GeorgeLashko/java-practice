package com.rakovets.course.challenge.oop.inheritance;

public class Cat {
    String name;

    Cat(String name){
        this.name = name;
    }

    void mew(){
        System.out.println("meow");
    }

    void purr(){
        System.out.println("mrrrr");
    }

    void getName(){
        System.out.println(this.name);
    }
    public void SetName(String name){
        this.name = name;
     }

}
