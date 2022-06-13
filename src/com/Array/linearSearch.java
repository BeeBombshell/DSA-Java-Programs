package com.Array;

class linearSearch {
    public static void main(String args[]) {
        int[] arr = { 13, 16, 19, 26, 29, 31, 34 };
        int val = 1;

        int result = linearsearch(arr, val);
        System.out.println(result);
    }

    static int linearsearch(int[] arr, int val) {
        
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println("Found at index: " + i);
                return i;
            }
        }
        // if target not found
        return -1;
    }
}