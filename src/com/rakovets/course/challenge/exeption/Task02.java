package com.rakovets.course.challenge.exeption;

public class Task02 {

    public void DisplayArray() {
        int[] nums = new int[3];
        try {
            nums[5] = 56;
            System.out.println(nums[5]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
         }
}
