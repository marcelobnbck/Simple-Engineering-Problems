package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_05 {
    public static int[] bubbleSortWhileSwap(int[] input) {
        int[] sorted = input.clone();
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            int i = 0;
            while (i < sorted.length - 1) {
                if (sorted[i] > sorted[i + 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    swapped = true;
                }
                i++;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSortWhileSwap(array)));
    }
}
