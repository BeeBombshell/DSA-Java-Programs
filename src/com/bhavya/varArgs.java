package com.bhavya;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    static void multiple(int a, int b, String... v) {
        
    }
    
    static void fun(int ...args){
        System.out.println(Arrays.toString(args));
    }
}
