package com.Array.BinarySearch;

import java.lang.Math;
import java.util.Arrays;

public class plusOne {

    public static void main(String[] args) {

        int digits[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        System.out.println(Arrays.toString(PlusOne(digits)));
    }

    public static int[] PlusOne(int[] digits) {
        int size = digits.length - 1;
        long number = 0;
        int j = 0;

        for (int i = size; i >= 0; i--) {
            number = number + digits[i] * (int) (Math.pow(10, j));
            j++;
        }

        number = number + 1;
        System.out.println(number);

        int newSize = 1 + (int) Math.log10(number);
        int newDigit[] = new int[newSize];

        for (int i = newSize - 1; i >= 0; i--) {
            newDigit[i] = (int) (number % 10);
            number = number / 10;
        }
        return newDigit;
    }
}
