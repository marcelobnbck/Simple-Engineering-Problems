package org.example.problems.DPK02;

import java.util.Arrays;

public class DPK02_impl_5 {
    public static void reverseArray5(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] fiveArray = {1, 2, 3, 4, 5};
        reverseArray5(fiveArray);
        System.out.println(Arrays.toString(fiveArray));
    }
}
