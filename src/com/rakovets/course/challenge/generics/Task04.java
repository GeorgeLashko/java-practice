package com.rakovets.course.challenge.generics;

public class Task04 {
    public static <T extends Comparable> T MaxValue (T [] values){
        T summa;
        T maximal = values[0];

        for (int i = 1; i <= values.length; i++){
            if (maximal.compareTo(values[i]) > 0){
                maximal = values[i];
            }
        }
        System.out.println(maximal);
        return maximal;
    }
}
