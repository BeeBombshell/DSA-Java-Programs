package com.bhavya;

public class shadowing {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; // class variable at line 4 is shadowed by local variable
        System.out.println(x);
        fun();
    }
    
    static void fun(){
        System.out.println(x);
    }
}
