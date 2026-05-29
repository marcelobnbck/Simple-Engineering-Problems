package org.example.problems.DPK12;

import java.util.Arrays;

public class DPK12_impl_04 {
    public static int[] bubbleSortSwap(int[] input) {
        int[] sorted = new int[input.length];
        int i = 0;
        while (i < input.length) {
            sorted[i] = input[i];
            i++;
        }
        while (i < sorted.length) {
            int j = i + 1;
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
                j++;
            }
            i++;
        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSortSwap(array)));
    }
}
