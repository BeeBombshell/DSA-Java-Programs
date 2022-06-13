package com.bhavya;
import java.util.*;

public class methods {
    public static void main(String[] args) {
        // sum(); 
        // String message = greet();
        // System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = in.next();
        String personalized = greet(name);
        System.out.println(personalized);
    }

    static String greet(String name){
        return "Hello " + name;
    }



    // static void sum() {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the first number");
    //     int a = in.nextInt();
    //     System.out.println("Enter the second number");
    //     int b = in.nextInt();
    //     int sum = a + b;
    //     System.out.println(sum);
    // }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
