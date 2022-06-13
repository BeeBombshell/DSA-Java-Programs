package com.bhavya;
import java.util.*;

public class switchCase{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // switch(fruit){
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("Sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case "Grape":
        //         System.out.println("Small fruit");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid fruit");
        // }
        int empID = in.nextInt();
        String department = in.next();

        switch(empID){
            case 1:
                System.out.println("Bhavya Verma");
                break;
            case 2:
                System.out.println("Bhavya Tewari");
                break;
            case 3:
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Please enter a valid department");
                }
        }
    
    }
}
