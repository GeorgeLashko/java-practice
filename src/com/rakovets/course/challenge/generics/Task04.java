package com.rakovets.course.challenge.generics;

public class Task04 {
    public static <T extends Comparable> T MaxValue (T [] values){
        T summa;
        T maximal = values[0];

        for (int i = 0; i <= (values.length)-1; i++){
            if (maximal.compareTo(values[i]) < 0){
                maximal = values[i];
            }
        }
        return maximal;
    }
}
