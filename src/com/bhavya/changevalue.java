package com.bhavya;

import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 2, 3, 4, 5 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void change(int[] nums) {
        nums[0] = 99; // if you want to change the value of the object via this ref variable
    }
}
