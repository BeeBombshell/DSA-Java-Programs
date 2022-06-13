package com.Array.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(answer(arr, 5));

    }

    static int answer(int[] arr, int target) {
        // first find the range
        // start with box of size 2
        int start = 0;
        int end = 1;

        int ans = -1;

        if (arr[0] == target) {
            return 0;
        }
        if (arr[1] == target) {
            return 1;
        }

        // Condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // formula for end = previous end + size of the box *2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        ans = BinarySearch(arr, target, start, end);

        return ans;
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
