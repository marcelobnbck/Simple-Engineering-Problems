package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_01 {
    public static int[] bubbleSortSwap(int[] input) {
        int[] sorted = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            sorted[i] = input[i];
        }

        for (int i = 0; i < sorted.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSortSwap(array)));
    }
}
