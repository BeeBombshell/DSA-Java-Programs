package com.bhavya;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 100; // reassigning the original variable
            int c = 99;
            // Values initialized in this block are not accessible outside the block
        }
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
