package com.rakovets.course.challenge.exeption;

public class Program {
    public static void main(String[] args) {
        Task01 str = new Task01();
        try {
            str.DisplayString();
        }catch (Exception ex){
        System.out.println(ex.getMessage());
         }


        Task02 array = new Task02();
        array.DisplayArray();

    }
}
