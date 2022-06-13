package com.bhavya;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // will not swap - call by value and call by reference
        // this change is only be valid in the function scope
    } 
}
