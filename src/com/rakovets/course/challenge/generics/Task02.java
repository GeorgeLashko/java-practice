package com.rakovets.course.challenge.generics;

public class Task02<T extends Comparable> {
    public static <T extends Comparable<T>> T Minimum (T firstValue, T secondValue, T thirdValue, T fourthValue, T fifthValue){
        if ((firstValue.compareTo(secondValue) > 0) && (firstValue.compareTo(thirdValue) > 0) && (firstValue.compareTo(fourthValue) > 0) && (firstValue.compareTo(fifthValue) > 0)){
            System.out.println(firstValue);
            return firstValue;
        }else if ((secondValue.compareTo(firstValue) < 0) && (secondValue.compareTo(thirdValue) < 0) && (secondValue.compareTo(fourthValue) < 0) && (secondValue.compareTo(fifthValue) < 0)){
            System.out.println(secondValue);
            return secondValue;
        }else if ((thirdValue.compareTo(firstValue) < 0) && (thirdValue.compareTo(secondValue) < 0) && (thirdValue.compareTo(fourthValue) < 0) && (thirdValue.compareTo(fifthValue) < 0)){
            System.out.println(thirdValue);
            return thirdValue;
        }else  if ((fourthValue.compareTo(firstValue) < 0) && (fourthValue.compareTo(secondValue) < 0) && (fourthValue.compareTo(thirdValue) < 0) && (fourthValue.compareTo(fifthValue) < 0)){
            System.out.println(fourthValue);
            return fourthValue;
        }else {
            return fifthValue;
        }
    }
}
