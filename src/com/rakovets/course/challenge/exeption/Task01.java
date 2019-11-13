package com.rakovets.course.challenge.exeption;

public class Task01 {
    String st = null;

    public void DisplayString() throws Exception {
        if (st == null) {
            throw new Exception("String == null");
        }
        System.out.println(st);
    }
}
