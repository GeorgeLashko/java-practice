package com.rakovets.course.challenge.oop.polymorphism;

public class Circle extends Figure {
    private int radius;



    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        System.out.println(Math.PI * Math.pow(radius,2));
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        System.out.println(2 * Math.PI * radius);
        return 2 * Math.PI * radius;
    }
}
