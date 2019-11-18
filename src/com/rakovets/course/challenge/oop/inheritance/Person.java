package com.rakovets.course.challenge.oop.inheritance;

public class Person {
    private int happiness;

    Person(int happiness){
        this.happiness = happiness;
        normalize();
    }

    int takeHappiness(int happiness){
        this.happiness += happiness;
        normalize();
        return this.happiness;
    }

    private void normalize(){
        if (this.happiness > 100) {
            this.happiness = 100;
        }else if (this.happiness < 0) {
            this.happiness = 0;
        }
    }
}
