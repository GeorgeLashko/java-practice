package com.rakovets.course.challenge.generics;

public class Task01<T extends Comparable> {




    public static <T extends Comparable<T>> T Max (T firstValue, T secondValue, T thirdValue){
            if ((firstValue.compareTo(secondValue) > 0) && (firstValue.compareTo(thirdValue)) > 0){
                System.out.println("maximal value is "+ firstValue );
                return firstValue;
            }else if ((secondValue.compareTo(thirdValue) > 0) && (secondValue.compareTo(firstValue) > 0)){
                System.out.println("maximal value is "+ secondValue );
                return secondValue;
            }else{
                System.out.println("maximal value is "+ thirdValue );
                return thirdValue;
            }


        }
    }




