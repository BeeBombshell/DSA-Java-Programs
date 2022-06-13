package com.Array.BinarySearch;

public class ceiling {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16 };
        int target = 18;
        int answer = binarySearch(arr, target);
        System.out.println(arr[answer]);
    }


    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        if (arr[mid] < target) {
            return mid + 1;
        } else {
            return mid;
        }
    }
}
