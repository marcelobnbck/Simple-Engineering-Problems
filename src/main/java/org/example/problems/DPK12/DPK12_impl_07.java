package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_07 {
    public static int[] bubbleSortDoWhileSwap(int[] input) {
        int[] sorted = input.clone();
        boolean swapped;
        do {
            swapped = false;
            int i = 0;
            do {
                if (sorted[i] > sorted[i + 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    swapped = true;
                }
                i++;
            } while (i < sorted.length - 1);
        } while (swapped);
        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSortDoWhileSwap(array)));
    }
}
