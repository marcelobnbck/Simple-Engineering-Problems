package org.example.problems.DPK02;

import java.util.Arrays;

public class DPK02_impl_06 {
    public static int[] reversedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reversedArray(initialArray)));
    }
}
