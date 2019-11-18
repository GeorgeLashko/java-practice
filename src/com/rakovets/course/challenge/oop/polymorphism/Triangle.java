package com.rakovets.course.challenge.oop.polymorphism;

public class Triangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    private double perimeter;

    Triangle(double firstSide,double secondSide,double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getPerimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;

    }

    @Override
    public double getArea() {
       double halfOfThePerimeter =  this.getPerimeter()/2;
        System.out.println(halfOfThePerimeter * (halfOfThePerimeter - this.firstSide) * (halfOfThePerimeter - this.secondSide) * (halfOfThePerimeter - this.thirdSide));
        return (Math.sqrt(halfOfThePerimeter * (halfOfThePerimeter - this.firstSide) * (halfOfThePerimeter - this.secondSide) * (halfOfThePerimeter - this.thirdSide)));
    }
}
