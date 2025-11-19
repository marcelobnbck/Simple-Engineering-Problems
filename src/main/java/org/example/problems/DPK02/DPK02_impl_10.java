package org.example.problems.DPK02;

import java.util.Arrays;

public class DPK02_impl_10 {
    public static void reversedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
    }
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5};
        reversedArray(initialArray);
        System.out.println(Arrays.toString(initialArray));
    }
}
